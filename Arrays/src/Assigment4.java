import java.util.Arrays;

//write a program to reverse the array itself, don’t print array in reverse 
public class Assigment4 {
	public void show() {
	int arr[]  =  {5, 2, 8, 7, 1};   
    int temp = 0;  
    for (int i = 0; i < arr.length; i++) {
    	
        for (int j = i+1; j < arr.length; j++) {
        	   
           if(arr[i] > arr[j]) {  
               temp = arr[i];  
               arr[i] = arr[j];  
               arr[j] = temp;  
           }   
          
        }   
        System.out.print(arr[i] + " ");  
    }   
}  
	public void reverse()
    {
		int [] arr = {3,90,45,29,37,78};
		Arrays.sort(arr);		
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1;i>=0;i--) {
		
			System.out.println(arr[i]);
		}
    }
    public static void main(String[] args)
    {
    
        Assigment4 a=new Assigment4();
        //a.show();
        a.reverse();
    }
}
