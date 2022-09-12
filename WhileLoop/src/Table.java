import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=1 ;
		System.out.println("enter a number  : ");
		int no = sc.nextInt();
		while  (i <=10)
		{
			System.out.println(no*i );
			i++;
		}
		sc.close();
		
		
	}

}
