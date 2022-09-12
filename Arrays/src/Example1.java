import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		int a[]=new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array  element : ");
		for (int i =0 ;i<a.length;i++)
		{
		   a [i] = sc.nextInt();
		}
		System.out.println("array element are :");
//		for (int i =0 ;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		//for reverse of input number
		
		/*for (int i =a.length-1; i>=0;i--)
		{
			System.out.println(a[i]);
		}*/
		
		//(((((( Enhanced for Loop
		for (int x:a)
		{
			System.out.println(x + " ");
		}
		
		sc.close();
	}
	
		 
}
