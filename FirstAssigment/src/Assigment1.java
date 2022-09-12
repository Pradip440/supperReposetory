import java.util.Scanner;

// write a java program to check a year is leap or not
public class Assigment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		 
		if (year % 400 == 0 )
		{
			System.out.println("year " +year+ " is a leap year ");
		}
		else if (year % 100==0)
		{
			System.out.println("year " +year+ " is a leap year ");
		}
		else if (year % 4 ==0)
		{
			System.out.println("year " +year+ " is a leap year ");
		}
		else 
		{
			System.out.println("year " +year+ " is a leap year ");
			
		}
		sc.close();
		
	}

}
