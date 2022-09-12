import java.util.Scanner;

public class Assigment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if ((num % 5==0 ) || ( num % 11 == 0))
		
			System.out.println("number is ddivisible by 5 or 11");
		
		else
			System.out.println("number is not ddivisible by 5 or 11");
	   sc.close();
	}

}
