import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();	 
		int a[] =new int [size];
		System.out.print("Addition :");
		int sum=0;
		for (int i=0; i< a.length;i++)
		{
			a[i]=sc.nextInt();
			if (a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println("sum of all even element : " +sum);
		        sc.close();   
	}
}
