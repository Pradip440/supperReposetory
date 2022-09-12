import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number  :");
		//Integer a =sc.nextInt();
		//System.out.println((a*a));
		try {
			System.out.println("Enter a number  :");
			Integer a =sc.nextInt();
			System.out.println((a*a));
		}
		catch(InputMismatchException e) {
			System.out.println("Please give numeric input ");
			System.out.println("exception type : "+e.getClass());
			System.out.println("Error massage is : " + e.getMessage());
		}

	}

}
