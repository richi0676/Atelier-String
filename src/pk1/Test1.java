package pk1;



public class Test1 {
	
   public static int sum(int... i) 
   { 
	   int s=0;
	   for(int j=0;j<i.length;j++)
	   {
		   s=s+i[j];
	}
	   return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("salut !");
      System.out.println( sum(1,2,3));
      String s0="salut-4iir";
   
      System.out.println( s0.toCharArray()[0]);
      
	}

}
