package TwoDArray;

import java.util.Arrays;

public class Example
{
	
	public static void main(String[] args)
	{
		int a[][]=  {  {4, 5, 6},  
				       {3, 4, 1},  
	                   {1, 2, 3}  
	                }; 		
		for (int arr[]: a)
		{
			{
				System.out.println(Arrays.toString(arr));
			}
		for(int x : arr)
			{
			System.out.print(" "+ x + " ");
			}
		System.out.println();
		}
	}
}
