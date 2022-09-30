import java.util.Arrays;
import java.util.Scanner;

public class PracticeProgram {
 
	//factorial of given number
	public void show() {
		int fact=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+ num +" is " +fact);
		
	}
// reverse array
	public void show2() {
		char ch[]= {'a','b', 'c'};
		for (int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
// reverse in ascending order
	public void show3() {
		char ch[]= {'d','c','b','a'};
		char temp=0;			
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]>ch[i+1]) {
				 temp=ch[i];
				 ch[i]=ch[i+1];
				 ch[i+1]=temp;
				 i=-1;
			}
			//System.out.println(ch[i+1]);
		}
		 System.out.println(Arrays.toString(ch));		
	}
	
	//copy array
	public void show4() {
		int arr[]= {1,2,3,4,5};
		int arr2 []= new int[arr.length];
		System.out.println("original");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\ncopy arr to arr2 :");
		for (int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i];
			System.out.print(arr2[i]+" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		PracticeProgram p=new PracticeProgram();
		//p.show();
		//p.show2();
		//p.show3();
		p.show4();
	}

}
