package pk1;

import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;






public class AtelierString {
	//1:
    public static char positionCaractere(int p,String chaine) {
    	
    	return chaine.charAt(p);
    }
    //3:
    public static int nombreCaractere(String chaine) {
    	int nb=0;
    	String[] tab=chaine.split(" ");
    	for(String s:tab) {
    		nb+=s.length();
    	}
    	return nb;
    	
    }
    //4:
    public static String comparerChaînes(String chaine1,String chaine2) {
    	String reponse="";
    	switch(chaine1.compareTo(chaine2)) {
    	case 0:{ 
    		reponse="égale";break;
    	}
    	case -1:{
    		reponse= "inférieur";break;
    	}
    	default :{
    		reponse= "superieur";break;
    	}
    	}return reponse;
    }
    //8:
    public static String charArrayToString(char[] table) {
    	String result="";
    	for(char c:table) {
    		result+=c;
    	}return result;
    }
    //11:
    public static String[] imprimerDateHeure() {
    	String[]tab = new String[2];
    	String date=String.valueOf(LocalDate.now().getDayOfMonth());
    	       date+=" ";
    	       date+=LocalDate.now().getMonth().toString().toLowerCase();
    	       date+=" ";
    	       date+=String.valueOf(LocalDate.now().getYear());
    	
    	
    	String time =String.valueOf(LocalTime.now().getHour());
    	       time+=" h ";
    	       time+=String.valueOf(LocalTime.now().getMinute());
    	tab[0]=date;tab[1]=time;
    	return tab;
    }
    //13:
    public static int idUnique(String chaine) {
    	int id =0;
    	String[] tab=chaine.split(" ");
    	for(String s:tab) {
    	for(char c:s.toCharArray()) {
    		id+=(int)c;
    		
    		
    		
    	}}
    	return id;
    }
    //18:
    public static String zeroSpace(String chaine) {
    	String[] tab=chaine.split(" ");
    	String result="";
    	for(String s:tab) {
    		result+=s;
    	}
    	return result;
    }
    //18:
    public static boolean existe(char[] tab,char c) {
    	
    	for(char a:tab) {
    		if(a == c) {return true;}
    	}return false;
    }

    
    //18:
    public static char secondFrequentCharacter(String chaine) {
    	String chaine2=zeroSpace(chaine);
    	
    	char[] temp=new char[chaine2.toCharArray().length] ;
    	int[] tempC=new int[chaine2.toCharArray().length];
    	int comp=0;
    	char alpha=' ';
    
    	//Test taille System.out.println("taille :"+chaine2.toCharArray().length);
    
    	 HashMap<Character,Integer> map = new HashMap<Character,Integer>(chaine2.toCharArray().length);
       for(int i=0;i<chaine2.toCharArray().length;i++) {
    	  
    	   alpha=chaine2.toCharArray()[i];
    	   if(!existe(temp,alpha)) {
    		   
        	   for(int j=i;j<chaine2.toCharArray().length;j++) {
        		                  if(alpha == chaine2.toCharArray()[j]) { comp++; }
          	    }
        	   temp[i]=alpha;
    	       tempC[i]=comp;
    	       map.put(temp[i], tempC[i]);
    	       comp=0;
    	   
    	   }
    	  }
       
       //
  	 
	 
  	 List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(map.entrySet());
  	 
  	
  	 
      Comparator<Entry<Character,Integer>> comparator = new Comparator<Entry<Character,Integer>>() {
          
          @Override
          public int compare(Entry<Character,Integer> e1, Entry<Character,Integer> e2) {
              Integer v1 = e1.getValue();
              Integer v2 = e2.getValue();
              
         
              return v1.compareTo(v2);
          }

      };
      
      Collections.sort(list, comparator);
      
      char[] index=new char[list.size()];
      int i=0;
      for(Entry<Character,Integer> e : list){
         
    	//Test sortie  System.out.println(e.getKey()+" "+e.getValue());
    	  index[i]=e.getKey();i++;
          
      }
      
      return index[list.size()-2];

         
    }
    //19:
    static String removeDuplicate(String chaine)   
    {   char[] str=chaine.toCharArray();
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < str.length; i++)   
        {   
              
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        return String.valueOf(Arrays.copyOf(str, index));   
    }   
    //20:
    public static char premierNonFrequentCharacter(String chaine) {
    	String chaine2=zeroSpace(chaine);
    	
    	char[] temp=new char[chaine2.toCharArray().length] ;
    	int[] tempC=new int[chaine2.toCharArray().length];
    	int comp=0;
    	char alpha=' ';
    
    	//Test taille System.out.println("taille :"+chaine2.toCharArray().length);
    
    	 HashMap<Character,Integer> map = new HashMap<Character,Integer>(chaine2.toCharArray().length);
       for(int i=0;i<chaine2.toCharArray().length;i++) {
    	  
    	   alpha=chaine2.toCharArray()[i];
    	   if(!existe(temp,alpha)) {
    		   
        	   for(int j=i;j<chaine2.toCharArray().length;j++) {
        		                  if(alpha == chaine2.toCharArray()[j]) { comp++; }
          	    }
        	   temp[i]=alpha;
    	       tempC[i]=comp;
    	       map.put(temp[i], tempC[i]);
    	       comp=0;
    	   
    	   }
    	  }
       
       //
  	 
	 
  	 List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(map.entrySet());
  	 
  	
  	 
      Comparator<Entry<Character,Integer>> comparator = new Comparator<Entry<Character,Integer>>() {
          
          @Override
          public int compare(Entry<Character,Integer> e1, Entry<Character,Integer> e2) {
              Integer v1 = e1.getValue();
              Integer v2 = e2.getValue();
              
         
              return v1.compareTo(v2);
          }

      };
      
      Collections.sort(list, comparator);
      
      char[] index=new char[list.size()];
      int i=0;
      for(Entry<Character,Integer> e : list){
         
    	  //System.out.println(e.getKey()+" "+e.getValue());
    	  if(e.getValue()==1) {
    		  index[i]=e.getKey();
    		
    	  }
    	  i++;
          
      }
      char temp1=' ';
      for(int j=0;j<index.length;j++) {
    	  if(Character.isLetterOrDigit(index[j])) {
    		  temp1=index[j];
    		 // System.out.println(temp1);
    	  }
      }
      
      return temp1;

         
    }
    //21:
    public static int chaineDivisePar(String chaine) {
    	int taille=chaine.length();
    	int diviseur=2;
    	while(true) {
    		if(taille % diviseur == 0 ) {
    			break;
    		}
    		diviseur++;
    	}
    	return diviseur;
    }
    //21:
    public static void monSplit(String chaine,int DivisePar) {
    	int comp=0;
    	String mot="";
    	for(char c:chaine.toCharArray()) {
    		mot+=c;
    		comp++;
    		if(comp == DivisePar) {
    			System.out.println(mot);
    			mot="";
    			comp=0;
    		}
    	}
    }
    //22:
    public static String  reverseChaine(String chaine) {
    	if (chaine.isEmpty()){
   		
   		 return chaine;
   		}
   
		return reverseChaine(chaine.substring(1)) + chaine.charAt(0);
    }
    //23:
    public static String reverseUnePartie(String chaine,String partie) {
    	
    	String chaineInv=reverseChaine(partie);
    	
    	return chaine.replace(partie,chaineInv);
    }
    //24:
    public static String removeMatches(String chaine,String...strings) {
    	String ch=chaine;
    	for(String mot:strings) {
    		ch=ch.replaceAll(mot,"");
    		
    	}
    	return ch;
    }
    //25:
    public static boolean testChaine(String chaine,String match) {
    	int index=-1;
    	if(chaine.contains(match)) {
    		index = chaine.indexOf(match);
    		if(index == 0 || index == 1) {return true;}
    	}
    	return false;
    }
    //26:
    public static String testChaineFL(String chaine) {
    	int Lch=chaine.charAt(chaine.length()-1);
    	int Fch=chaine.charAt(0);
    	
    	if(Lch == Fch) {
    		chaine=chaine.substring(1,chaine.length() );
    		chaine= chaine.substring(0,chaine.length()-1 );
    		return chaine;
    	}
    	return chaine;
    }
    //28:
    static int a=0;
    public static int comterSousChaine(String chaine,String sChaine,int occ) {
    	a=occ;
    
    	if( !chaine.isEmpty() && chaine.contains(sChaine) ) {
    		chaine.indexOf(sChaine, 0);
    		a++;
    		//System.out.println(i);
    		comterSousChaine(chaine.substring(chaine.indexOf(sChaine, 0)+sChaine.length()-1,chaine.length()),sChaine,a);
    		
    	}
    	
    	return a;
    	
    }
    //29:
    public static String chaineRepetantCh(String chaine,int fois) {
    	
    	
    	char[] table=chaine.toCharArray();
    	String nouv="";
    	for(int i=0;i<chaine.length();i++) {
        	for(int j=0;j<fois;j++) {
        		nouv+=table[i];
        	}
    	}
    	return nouv;
    } 
    //30:
    public static int triplesCaracteres(String chaine) {
    	char[] table=chaine.toCharArray();
    	int comp=0;
    
    	for(int i=0;i<table.length;i++) {
    		if(table[i] == table[i+1] && table[i+1] == table[i+2]) {
    			comp++;
    		}
    	
    		if(i>table.length-4) {break;}
    	}
    	return comp;
    }
    //32:
    public static int sommeChaine(String chaine) {
    	char[] table=chaine.toCharArray();
    	int somme=0;
    	String nb="";
    	for(char c:table) {
    		
    		if(Character.isDigit(c)) {
    			nb+=c;
    			
    		}else if(!nb.isEmpty()) {
    			
    			somme+=Integer.parseInt(nb);
    			nb="";
    		}
    	}
    	return somme;
    }
    //33:
    public static int nombreMots(String chaine ,char m,char n) {
    	int nb=0;
    	String[] table=chaine.split(" ");
    	for(String s:table) {
    		if(m==s.charAt(s.length()-1) || n==s.charAt(s.length()-1)) {
    			nb++;
    		}
    	}
    	return nb;
    }
    //34:
    public static boolean contientUniqueNombre(String chaine) {
    	for(char c:chaine.toCharArray()) {
    		if(!Character.isDigit(c)) {return false;}
    	}
    	return true;
    }
    //35:
    public static void convertir(String chaine,String type) {
    	switch(type) {
    	case "Integer":
    	case "int":{
    		System.out.println("\""+chaine+"\" comme int est "+Integer.parseInt(chaine)+" et comme Integer est "
    	                       +Integer.parseInt(chaine));
    		break;
    	}
    	case "long":
    	case "Long":{
    		System.out.println("\""+chaine+"\" comme long est "+Long.parseLong(chaine)+" et comme Long est "
    	                       +Long.parseLong(chaine));
    		break;
    	}
    	
    	case "flotteur":{
    		System.out.println("\""+chaine+"\" comme case flotteur : est "+Float.parseFloat(chaine)+" et comme Flotter est "
    	                       +Float.parseFloat(chaine));
    		break;
    	}
    	
    	case "double":{
    		System.out.println("\""+chaine+"\" comme double est "+Double.parseDouble(chaine)+" et comme Double est "
    	                       +Double.parseDouble(chaine));
    		break;
    	}
    	default : {
    		break;
    	}
    	}
    }
    //37:
    public static int occurrences(String chaine,String seq) {
    	int comp=0;
    	String[] table=chaine.split(" ");
    	for(String s:table) {
    		if(s.contains(seq)) {comp++;}
    	}
    	return comp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// Atelier : String
		System.out.println("--------  Atelier : String ----------");
		//1:
		System.out.println("1)");
		//
		String chaine="Exercices Java !";
		System.out.println("Le caractère à la position "+0+" est :"+positionCaractere(0,chaine));
		System.out.println("Le caractère à la position "+10+" est :"+positionCaractere(10,chaine));
		//
		//2:
		System.out.println("2)");
		System.out.println("Le caractère à la position "+10+" est :"+(int)positionCaractere(10,chaine));
		//
		//3:
		System.out.println("3)");
		System.out.println("le nombre de caractères de '"+chaine+"' est :"+nombreCaractere(chaine));
		//
		//4:
		
		String chaine1="Ceci est l'exercice 1";                                                                                  
		String chaine2="Ceci est l'exercice 2"; 
		//
		System.out.println("4)");
		System.out.println("\""+chaine1+"\" est "+comparerChaînes(chaine1,chaine2)+" à \""+chaine2+"\"");
		//
		//5:
		String chaine11="ceci est l'exercice 1";
		System.out.println("5)");
		System.out.println("\""+chaine1+"\" est "+(chaine1.compareToIgnoreCase(chaine11)==0?"égale":"non égale")+" à \""+chaine11+"\"");
		//
		//6:
		String chaine3="Exercices PHP et";
		String chaine4="Exercices Python";
		//
		System.out.println("6)");
		System.out.println("La chaîne concaténée : "+chaine3.concat(" "+chaine4));
		//
		//7:
		String seq="et";
		String chaine5="Exercices PHP et Python";
		//
		System.out.println("7)");
		System.out.println("Chaîne originale : "+chaine5);
		System.out.println("Séquence spécifiée de valeurs des caractères : "+seq);
		System.out.println("Résultat : "+chaine5.contains(seq));
		//
		//8:
		char[] tab= {'B','O','N','J','O','U','R'};
		//
		System.out.println("8)");
		System.out.println("Voila ! :"+charArrayToString(tab));
		//
		//9:
		String chaine6="Exercises Python";
		String seq2="no";
		//
		System.out.println("9)");
		System.out.println("\""+chaine6+"\" se termine par \""+seq2+"\" ? "+chaine6.endsWith(seq2));
		//
		//10:
		System.out.println("10)");
		System.out.println("\"Stephen Edwin King\" équivaut à "
		                   +"\"stephen edwin king\" ?"
				           +("Stephen Edwin King".compareToIgnoreCase("stephen edwin king")==0?" vrai ":" faux "));
		//
		//11:
		System.out.println("11)");
		System.out.println("Date et heure actuelles :");
		System.out.println(imprimerDateHeure()[0]);
		System.out.println(imprimerDateHeure()[1]);
		//
		//12:
		System.out.println("12)");
		System.out.println("la chaine(String) : \""+chaine+"\"");
		System.out.println("Contient comme caractere(s) :");
		for(char c:chaine.toCharArray()) {
			System.out.println("-"+c);
		}
		//
		//13:
		String chaine8 ="les exercices java";
		//
		System.out.println("13)");
		System.out.println("L’identifiant de  «"+chaine8+"» est "+idUnique(chaine8));
		//
		//14:
		String chaine7="exemple.com";
		//
		System.out.println("14)");
		System.out.println("La longueur de la chaîne de "+chaine7+"caractères de  est :"+chaine7.length());
		//
		//15:
		String chaine9="Le Renard BruN Est Très Rapide!";
		//
		System.out.println("15)");
		System.out.println("Chaîne originale : "+chaine9);
		System.out.println("Chaîne en minuscules  : "+chaine9.toLowerCase());
		//
		//16:
		String chaine10="le renard brun est très rapide!";
		//
		System.out.println("16)");
		System.out.println("Chaîne originale : "+chaine10);
		System.out.println("Chaîne en minuscules  : "+chaine10.toUpperCase());
		//
		//17:
		String chaine12=" Exercices Java ";  
		//
		System.out.println("17)");
		System.out.println("Chaîne originale : ["+chaine12+"]");
		System.out.println("Nouvelle chaîne:  : ["+chaine12.trim()+"]");
		//
		//18:
		String chaine22="succès";
		//
		System.out.println("18)");
		//
		System.out.println("La chaîne donnée est :"+chaine22);
		System.out.print("Le deuxième caractère le plus fréquent dans la chaîne est : ");
		System.out.println(secondFrequentCharacter(chaine22));
		//
		//19:
		String chaine21="ville";
		//
		System.out.println("19)");
		//
		System.out.println("La chaîne donnée est :"+chaine21);
		System.out.println("Après avoir supprimé les caractères en double, la nouvelle chaîne est la suivante : "
		                    +removeDuplicate(chaine21));
		//20:
		String chaine23="gibblegabbler";
		//
		System.out.println("20)");
		//
		System.out.println("La chaîne est :"+chaine23);
		System.out.println("Le premier caractère non répété dans la chaîne est  : "
		                    +premierNonFrequentCharacter(chaine23));
		//21:
		chaine="abcdefghijklmnopqrstuvwxy";
		//
		System.out.println("21)");
		//
		System.out.println("La chaîne donnée est : "+chaine);
		System.out.println("La chaîne est divisée en "+chaineDivisePar(chaine)+" parties et elles sont : ");
		monSplit(chaine,chaineDivisePar(chaine));
		//22:
		//
		System.out.println("22)");
		System.out.println("La chaîne donnée est : "+chaine);
		System.out.println("La chaîne reversé  : "+reverseChaine(chaine));
		//
		//23:
		//
		System.out.println("23)");
		System.out.println("La chaîne  : "+chaine);
		System.out.println("La sous chaîne à inverse : "+"abcd");
		System.out.println("Resultat : "+reverseUnePartie(chaine,"abcd"));
		//
		//24:
		//
		System.out.println("24)");
		System.out.println("La chaîne  : "+chaine);
		System.out.println("Resultat   : "+removeMatches(chaine,"a","bc"));
		//
		//25:
		//
		System.out.println("25)");
		System.out.println("La chaîne  : "+"bon");
		System.out.println("Resultat   : "+(testChaine("bbon","bon")?"vrai":"faux"));
		//
		//26:
		chaine="testcricket";
		//
		System.out.println("26)");
		System.out.println("La chaîne de caractères donnée est  : "+chaine);
		System.out.println("La nouvelle chaîne est :  "+testChaineFL(chaine));
		//
		//27:
		chaine="dikchapop";
		//
		System.out.println("27)");
		System.out.println("La chaîne donnée est  : "+chaine);
		System.out.println("Est-ce que « pop » apparaît dans la chaîne donnée ? "
		                    +(chaine.contains("pop")?"vrai":"faux"));
		// comterSousChaine(String chaine,String sChaine,int occ)
		//28:
		System.out.println("28)");
		System.out.println("La chaîne donnée est  : "+"lifelifelifefjhffhlife");
		System.out.println("sous-chaîne \"life\" est presenter : "
		                   +comterSousChaine("lifelifelifefjhffhlife","life",0)
		                   +" fois");
		//
		//29:
		chaine="welcome";
		//
		System.out.println("29)");
		System.out.println("La chaîne donnée est :"+chaine);
		System.out.println("La nouvelle chaîne est la suivante  :"
				            +chaineRepetantCh(chaine,2));
		//
		//30:
		chaine="welllcommmeee";
		//
		System.out.println("30)");
		System.out.println("La chaîne donnée est :"+chaine);
		System.out.println("Le nombre de triples dans la chaîne est de : "
				           +triplesCaracteres(chaine));
		//
		//31:
		chaine="c'est une chaîne";
		//
		System.out.println("31)");
		System.out.println("La chaîne originale : "+chaine);
		System.out.println("La nouvelle chaîne: "+chaine.replace("c'est", "ce n'est pas"));
		//
		//32:
		chaine="it 15 is 25 a 20 string";
		//
		System.out.println("32)");
		System.out.println("La chaîne: "+chaine);
		System.out.println("La somme des nombres de la chaîne est de : "
		                   +sommeChaine(chaine));
		//
		//33:
		chaine="mam est dans le salon";
		//
		System.out.println("33)");
		System.out.println("La chaîne donnée est : "+chaine);
		System.out.println("Le nombre de mots qui se terminent par m ou n est :  "
		                   +nombreMots(chaine ,'m','n'));
		//
		//34:
		chaine="131231231231231231231231231212312312";
		//
		System.out.println("34)");
		System.out.println("La chaîne : "+chaine+" -> "
				            +(contientUniqueNombre(chaine)));
        //
		//35:
		System.out.println("35)");
		convertir("21.25478254D","double");
		//
		//36:
		chaine="abcdefabcdeabcdaaa";
		//
		System.out.println("36)");
		System.out.println("Chaîne originale : "+chaine);
		System.out.println("Nouvelle chaîne :  "+chaine.replaceAll("a", ""));
		//
		//37:
		chaine="abcd abc aabc baa abcaa";
		//
		System.out.println("37)");
		System.out.println("\""+"aa"+"\" s'est produit "
				             +occurrences(chaine,"aa")
				             +" fois dans \""+chaine+"\".");
	}

}
