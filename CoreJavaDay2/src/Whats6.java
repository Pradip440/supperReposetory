import java.util.Scanner;

public class Whats6 
{

	public static void main(String[] args)
	{
		int i, num , sum =0 ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		 num= sc.nextInt();
		  
	     for(i = 1; i <= num; i++)  
	   {  
	    	 if (i%2==1)//odd  //(i%2==0) Even
	    	 {
	    		 sum= sum + i;
	    	 }
	    		 
	   }
	    	 System.out.println("Sum of First 100 even Numbers is = " + sum ); 
	       
	    sc.close();

	}

}
