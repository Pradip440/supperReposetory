import java.util.Scanner;
// WAP to print an array in reverse order
public class Assigment3 {
	 public static void main(String[] args) {  
	         
	        int [] arr = new int [] {3,90,45,29,37,78}; 
//		    Scanner sc = new Scanner(System.in);
//			System.out.print("Enter size of array : ");
//			int size = sc.nextInt();	 
//			int arr[] =new int [size];
//			System.out.print("enter array element");
//			for (int i=0; i< arr.length;i++)
//			{
//				arr[i]=sc.nextInt();
//			}
			
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) 
	        {  
	            System.out.println(arr[i] + " ");  
	        }    
	        System.out.println("Array in reverse order: ");    
	        for (int i = arr.length-1; i >= 0; i--) 
	        {  
	            System.out.println(arr[i] + " ");  
	        } 
	      //  sc.close();
	    }  
	 
}
