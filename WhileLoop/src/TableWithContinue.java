import java.util.Scanner;

public class TableWithContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		for (int i=2;i<=10;i++)
		{
			if (i==6)
				continue;
			for(int j=1;j<=10;j++)
				{
				System.out.print(i*j+ " ");
				}
			System.out.println();
			sc.close();
		}

	}

}
