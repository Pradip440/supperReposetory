import java.util.Scanner;

public class AssigHW2
{

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner (System.in);
	   System.out.println(" Enter a charecter :  ");
	   char ch = sc.next().charAt(0);
	   if ((ch >='a' && ch<= 'z') || ( ch>='A' && ch <='Z' ))
	   {
		   System.out.println( ch + "  is alphabet ");
	   }
	   else if ( ch >='0' && ch <='9')
	   {
		   System.out.println(ch + " is a Digit ");
	   }
	   else
	   {
		   System.out.println( ch + "  is a special charecter ");
	   }

	}

}
