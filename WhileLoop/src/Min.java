import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		/*int min = num % 10 ;
		while (num>0)
		{
			if (num %10<min)
			{
				min = num%10;
			}
			num = num/10;
		}
		System.out.println(min);
		sc.close(); */
		int max = num%10;
		while (num<0)
		{
			if (num%10>max)
			{
				max = num%10;
			}
			num= num/10;
		}
		System.out.println(max);
	}

}
