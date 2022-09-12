// Program to copy all element of one array into another array
public class CopyArray {

	public static void main(String[] args) {
		int a1[]=new int [] {1,2,3,4,5};
		int a2[]=new int [a1.length];
		System.out.println("Element of Original Arrays are : ");
		for (int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i] + " ");
		}
		System.out.println("Element of New Arrays are");
		for(int i =0;i<a2.length;i++)
		{
			a2[i]=a1[i];
			System.out.println(a2[i]+ " ");
		}
	}

}
