import java.util.Arrays;
import java.util.Scanner;
public class Excercise6 {
	//sum of digit means ex- 234 sum is 9
public void sumDigits() {
		
	 Scanner in = new Scanner(System.in);
     System.out.print("Input an integer: ");
     int n = in.nextInt();
     int result = 0;
		
		while(n > 0) {
			result += n%10 ;
			n /= 10;
		}
		
		System.out.println( result);
	}
//leap year
public void show2() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a year: ");
    int year = in.nextInt();
    boolean a=(year%4)==0;
    if(a) {
    	System.out.println(year+" is leap year");
    }
    else {
    	System.out.println(year+" is not leap year");
    }
}
// Display n terms of natural numbers and their sum
public void show3() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int n = in.nextInt();
    int sum=0;
    for (int i=1;i<=n;i++) {
    	System.out.println(i);
    	sum+=i;
    }
    System.out.println("sum of all nth natural number is :"+sum);

}
public void show4() {
	Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int n = in.nextInt();
    for (int i=1;i<=10;i++) {
    	int a=n*i;
    	System.out.println(a);
    }
}
public void show5() {
	Scanner in = new Scanner(System.in);
    System.out.print("Input a number: ");
    int n = in.nextInt();
    int k=1;
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=i;j++) {
    		
    		System.out.print(k++ +" ");
    	}
    		System.out.println("");
    	
    }
}
public void show6() {
	int[] arr = {5, 7, 2, 4, 9,11};
	System.out.println("Original Array: "+Arrays.toString(arr)); 
	int max = arr[0];
	int min = arr[0];
	for(int i = 1; i < arr.length-1; i++)
	{
		if(arr[i]>min) {
			max=arr[i];
		}
		else if(arr[i]<max) {
			min=arr[i];
		}
	
	}
	System.out.println(max-min);
}
public void show7() {
	int arr[]= {-20,0,-25,15,19,37,23};
	int temp;
	for(int i=0;i<arr.length-1;i++){
	if(arr[i]>arr[i+1]) {
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		i=-1;
		}
	}
	System.out.println(Arrays.toString(arr));
//	int a=arr.length-1;
//	for(int i=arr.length-1;i>=0;i--) {
//		
//		System.out.println(arr[i]);
//		
//	}
}
public void show8() {
	int arr[]= {2,7,4,5,5,6};
	int arr1= arr.length;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==arr1) {
			System.out.println(arr1);
		}
	}
}
  public static void main(String[] args)
    {
	  Excercise6 e=new Excercise6();
	 // e.sumDigits();
	 // e.show2();
	 // e.show3();
	 // e.show4();
	 // e.show5();
	 // e.show6();
	  e.show7();
    //e.show8();
    
    }	
 }

