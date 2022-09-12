// write a program to find max between three numbers
import java.util.Scanner;
public class Assigment3Max {

	public static void main(String[] args) {
		int a,b,c;
	     Scanner sc= new Scanner (System.in);
	     System.out.println("Enter three numbers");
	     a=sc.nextInt();
	     b=sc.nextInt();
	     c=sc.nextInt();
      if (a>b && a>c)
    	  System.out.println("A is max numbers" + a);
      else if ( b >a && b>c)
    	  System.out.println("B is max numbers" + b);
      else
    	  System.out.println("C is max " + c);
    	  		
    	  
	}

}
