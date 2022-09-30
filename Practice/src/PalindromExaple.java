
import java.util.*;   
class PalindromExaple  {
	public void show() {
		 String s, reverse = "";  
		 
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a number or string");  
	      s = sc.nextLine();  
		//s="amama"; 
	     
	      for ( int i =s.length() - 1; i >= 0; i-- ) 
	      { 
	    	  reverse += s.charAt(i); 
	    	  
	       }
	      if (s.equals(reverse))  
	         {
	        	 System.out.println("Entered string/number is a palindrome.");  
	         }
	      else
	      	{
	    	  	System.out.println("Entered string/number isn't a palindrome.");  
	      	} 

	     // sc.close();
	     
	
	    
	}
	   public static void main(String args[])  
	   {  
		   PalindromExaple p=new PalindromExaple();
		   p.show();
	   }	  
	 
}
