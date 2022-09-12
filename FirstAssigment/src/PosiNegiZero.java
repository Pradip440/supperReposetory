import java.util.Scanner;

public class PosiNegiZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc. nextInt();
		if (n>0)
		
			System.out.println(n + "   is positive ");
		
		else if (n<0)
		
			System.out.println(n + "  is nagitve ");
		else
			System.out.println("  is Zero ");
		
		sc.close();
			
	}

}
