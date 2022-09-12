package sorting;

import java.util.Arrays;

public class AscendingOrder {
	public void bubbleSort(int a[])
	{
		System.out.println("Array size is ::");
	for(int i=0;i<a.length-1;i++)
	{
		System.out.println("pass " + (i+1));
		for (int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
		{
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		System.out.println("________________________");
	}
	}
	public static void main(String[] args ) 
	{
	
	int a[]= {5,4,2,3,1};
	AscendingOrder o=new AscendingOrder();
	System.out.println("Before sorting :  ");
	System.out.println(Arrays.toString(a));
	o.bubbleSort(a);
	System.out.println("After sorting");
	System.out.println(Arrays.toString(a));
	}
}
