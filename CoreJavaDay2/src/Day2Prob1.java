// if else ladder 
import java.util.Scanner;
public class Day2Prob1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marksin physics : ");
		int m1 = sc.nextInt();
		System.out.println("Enter marks in maths : ");
		int m2 = sc.nextInt();
		System.out.println("Enter marks in chem : ");
		int m3 = sc.nextInt();
		int total = m1 + m2 + m3 ;
		float per = (total*100)/300 ;
		System.out.println("percentage in PCM group is : " + per + "%");
		if  (per >= 80.00f)
		     System.out.println("student is pass with grade A+ ");
		else if ( per >= 60)
			System.out.println("student is pass with grade A");
		else if (per >= 50) 
			System.out.println("student is pass with grade B ");
		else if (per >= 40)
			System.out.println("student is pass with grade C ");
		else
			System.out.println("student is Fail!!! ");

	}

}
