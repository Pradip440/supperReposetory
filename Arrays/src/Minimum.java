
public class Minimum 
{  
	// for min by Parameterized
//		static void min(int arr[])
//		{  
//			int min=arr[0];  
//			for(int i=1;i<arr.length;i++)  
//				if(min>arr[i])  
//					min=arr[i];  
//		  
//			System.out.println(min);  
//		}  
//		  
//		public static void main(String args[])	
//		{  
//			int a[]={33,3,4,5}; 
//			min(a); 
//		}  
	//for to print  maximum value by parameterized concept
	static void max(int arr[])
	{  
		int max=arr[0];  
		for(int i=1;i<arr.length;i++)  
			if(max<arr[i])  
				max=arr[i];  
	  
		System.out.println(max);  
	}  
	  
	public static void main(String args[])	
	{  
		int a[]={33,3,47,5}; 
		max(a); 
	}  
}
