import java.util.Scanner;

//Program to print the duplicate elements of an array.
public class Assigment5 {
	 public static void main(String[] args)
	 {         
	        int [] arr =  {3,10,90,78,56,10,78,5,61};   
//	        Scanner sc = new Scanner(System.in);
//			System.out.print("Enter size of array : ");
//			int size = sc.nextInt();	 
//			int arr[] =new int [size];
//			System.out.print("enter array element");
//			for (int i=0; i< arr.length;i++)
//			{
//				arr[i]=sc.nextInt();
//			}
	        
	        System.out.println("Duplicate elements in given array: ");  
	        for(int i = 0; i < arr.length-1; i++)
	        {  
	        	 for(int j = i + 1; j < arr.length; j++)
		            {  
		                if(arr[i] == arr[j]) 
		                {
		                    System.out.println(arr[j]);  
		                }
		            }  
	            
	        }  
	       // sc.close();
	    }  
}
