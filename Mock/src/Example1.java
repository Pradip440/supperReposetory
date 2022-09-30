import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
	public  void showDiffOfFive() {
		int arr[]= {2,7,1,8,12,17,22,36};
		int arr1[]= {5,10,15,14,20,25};
		System.out.println("Difference of five from given array : ");
//		System.out.println(arr[0]);
//		  for(int i1=0;i1<arr.length;i1++) {
//			  for(int j=0;j<i1;j++) {
//			  if(arr[i1]-arr[j]==5) 
//				  System.out.println(arr[i1]);
//			  }
//		  }
		System.out.println(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[0]+5==arr[i]) { 
				arr[0]=arr[i];
				System.out.println(arr[0]);
			}
		  }	
	 }
	public void showPrimeNumberFromArray() {
		int arr[]= {2,7,1,8,12,9,17,23,36};
		System.out.println("Prime number from given array :");
		
		for(int i =0;i<arr.length;i++) {
			boolean flag=true;
		for(int j=2;j<arr[i];j++) {
			if(arr[i]%j==0) {
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(arr[i]+"");
		}
		}
	}
	public void show3() {
		int num[]= {1,2,3,4,5};
		System.out.println("tables");
//		for(int i=0;i<10;i++) {	
//			
//			System.out.println(num*(i+1));
//		}
		for(int i=0;i<num.length;i++) {
		System.out.println((int)Math.pow(num[i], 2));
		}
	}
	public void show4() {
		//int n=0;
		String PM="";
		for(int i=0;i<100;i++) {
			int cnt=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0)
					cnt+=1;
			}
		
			if(cnt ==2) {
				PM=PM+i+" ";
				//System.out.println(i);
			}
		}
		System.out.println(PM);
	}
	public void show5() {
		for(int i=1;i<100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
	public void showSortArrayString() {
		int arr[]= {6,7,5,8,9,4,3,2};
		String str[]= {"java","mava","somo","c++"};
		Arrays.sort(arr);
		System.out.println(" sorted array :"+ Arrays.toString(arr));
		Arrays.sort(str);
		System.out.println(" sorted array :"+ Arrays.toString(str));
	}
	 public void showSumOFArray() {
		 int []arr= {23,4,45,56,23};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			sum+=arr[i];	
			}
		System.out.println(sum);
	 }	
	 public void showReverse() {
		 int []arr= {23,4,45,56,23};
		 for(int i=arr.length-1;i>=0;i--)
				System.out.println(arr[i]);
		 }
	 
	 public int show7() {
		 int j;
		 int arr[]= {2,3,5,7,6,4,3,2};
	        for (int i=0; i < arr.length ;i++) {
	            for(j=0; j <arr. length ;j++) {
	                if (arr[i]==arr[j] && i!=j) {
	                    break;
	                }
	            }   
	            if (j == arr.length)
	                return arr[i];
	            }
	         return -1;
	         
	    }
	 public void show8()
	 {
		 int arr[]= {1,0,1,1,3,0,1,2,1,0}; 

//		 int arr[]= {1,0,1,1,0,1,0,1,0};
//		 int arr[]= {1,0,6,5,4,0,8,0};
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=0) {
				arr[count]=arr[i];
				 count++;
			 }
		 }
		 while(count<arr.length) {
			 arr[count]=0;
			 count++;
		 }
		 System.out.println(Arrays.toString(arr));
	 }
	 
	 public void show9() {
		
		 int arr[]= {1,0,1,1,3,1,0}; 
		 int temp=0;
		 for(int i=0;i<arr.length-1;i++) {
			 
				 if(arr[i]<arr[i+1]) {
					 temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
					 i=-1;
				 }
				// System.out.println(arr[i]);
		 }	 
		
		 System.out.println(Arrays.toString(arr));		
	 }
		  
		  public void show10() {
			  
		  }
		
	public static void main(String[] args) {
		Example1 e=new Example1();
		//e.showDiffOfFive();
		//e.showPrimeNumberFromArray();
		//e.show5();
		//e.showSortArrayString();
		//e.showSumOFArray();
		//e.showReverse();
		//e.showFirstNonRepeating();
		//e.show7();
		 e.show8();
		e.show9();
		
	}
}
