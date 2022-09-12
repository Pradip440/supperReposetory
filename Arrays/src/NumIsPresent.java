import java.util.Scanner;

public class NumIsPresent {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number : "  );
		int num=sc.nextInt();
		
		boolean isExist=false;
		for (int i=0;i<arr.length;i++)
		{
			
			if (num==arr[i]) 
			{
		     isExist=true;
			break;	
			}
		}		
	

		if (isExist)
		{
			System.out.println("integer is present");	
		}
		else
		{
			System.out.println("integer is not present");
		}
		sc.close();
	}
}
