package exception1.com;
import java.util.Scanner;
// find out the sum of first and last digit from the number
public class Test1 {
	public static int firstDigit(int n) { 
		while (n>=10)
			n=n/10;
		return n;	
	}
	public static int lastDigit(int n) {
		
		return ( n%10);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		System.out.println("first digit is : "+firstDigit(n));
		System.out.println("Last digit is : "+lastDigit(n));
		System.out.println("Sum of 1st and last digit :"+firstDigit(n)+lastDigit(n));
sc.close();
	}

}
