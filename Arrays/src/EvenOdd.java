import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();	 
		int a[] =new int [size];
		System.out.print("enter array element");
		for (int i=0; i< a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("odd  element in arrays are  : ");
		for(int i =0 ; i < a.length; i++)
		{
			if (a[i]%2!=0)
				System.out.println(a[i]+" ");
		}
        System.out.println("even element in array are : ");
        for(int i =0; i<a.length;i++)
        {
        	if (a[i]%2==0)
        		System.out.println(a[i]+" ");
        	
        }
        sc.close();        
	}
}
