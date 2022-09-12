import java.util.Scanner;

public class ShowEven {
		public static void main(String[] args) {
			int a[]= {1,2,3,4,5,6};
			System.out.println("element of given array on even position");
			//	int a[]=new int [5];
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter array  element : ");
			for (int i =0 ;i<a.length;i++)
			{
			   a [i] = sc.nextInt();
			}
			int sum=0;
			for (int i=1;i<a.length;i++)
			{
				if (a[i]%2==0)
			    {
					sum+=a[i];
					System.out.println(a[i]);
					System.out.println("sum of all even number in alternate position value : " + sum);
			    }
				
			}
		}
}
