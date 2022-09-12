package exception1.com;

import java.util.Scanner;

class InvalidMobileException extends Exception
{
	
	public String Msg()
	{
		return "Please enter only number";
	}
}
public class MobileNumberValidation {
	
	public void validate(String n) throws InvalidMobileException
	{
		
		if(n.matches("(0/91)?[7-9][0-9]{9}"))
		{
			System.out.println("Number is valid");
		}
		else
		{
			throw new InvalidMobileException();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String n=sc.next();
		MobileNumberValidation m=new MobileNumberValidation();
		try {
			m.validate(n);
			
		} catch (InvalidMobileException e) {
			
			System.out.println(e.Msg());
		}

	}

}
