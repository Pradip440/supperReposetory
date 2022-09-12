import java.util.Scanner;

public class Ass1wats {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2 ; i <= n/2 ;++i)
		{
			if (n%i==0)
		  {
			flag= true;
			break;
			
		  }
		}
		if (flag)
			System.out.println(n+ " is not prime");
		else
			System.out.println(n+ " is  prime");
		
		sc.close();
	}

}
