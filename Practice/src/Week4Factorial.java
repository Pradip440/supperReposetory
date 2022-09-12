import java.util.Scanner;

class Palindrom {
	public void palindrom1() {
		 String  reverse = "";   
	      Scanner sc = new Scanner(System.in); 
	      
	      System.out.println("Enter a number or string");  
	      
	      String s = sc.nextLine();   
	    
	      int length = s.length();   
	      for ( int i = length - 1; i >= 0; i-- ) 
	      { 
	    	  reverse = reverse + s.charAt(i); 
	    	  
	       }
	      if (s.equals(reverse))  
	         {
	        	 System.out.println("Entered string/number is a palindrome.");  
	         }
	      else
	      	{
	    	  	System.out.println("Entered string/number isn't a palindrome.");  
	      	} 
	      sc.close();
	   } 
	public void palindrom2() {
		 int r,sum=0,temp;    
		  Scanner sc1 = new Scanner(System.in);   
	      System.out.println("Enter a number");  
	      
	      int n = sc1.nextInt(); 
	      sc1.nextLine();
		
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
		  sc1.close();
		}  
}

public class Week4Factorial {
	 
	 
	public static void main(String[] args) {
		Palindrom e1=new Palindrom();
		e1.palindrom1();
		e1.palindrom2();

		
	}
		 
}

