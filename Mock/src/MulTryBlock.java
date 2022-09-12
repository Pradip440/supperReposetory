import java.util.Arrays;

public class MulTryBlock {
	public void show() {

		    int[]Arr = {10,43,27,98,75,59,191};

		    int largest =  Arr[0];
		    int smallest =  Arr[0];
		    int sum=0;
		    for( int i=0;i<Arr.length;i++ ) {
		        if(Arr[i] > largest) {
		            largest = Arr[i];
		        }
		        else if (smallest > Arr[i]) {
		            smallest = Arr[i];
		        }
		       // sum=largest+smallest;
		        
		    }
		    System.out.println("Largest number is : "+largest );
		    System.out.println("Smallest number is : "+smallest);
		   // System.out.println("sum of lagest and smallest :"+ sum);
	}
	public void show2() {
		 int arr[] = {0,10,43,0,27,98,75,59,191,0};
		    int cnt = 0;
		    for(int i=0;i < arr.length;i++) {
		        if(arr[i] != 0) {
		        	arr[cnt] = arr[i];
		        	cnt++;
		        }
		    }
		    while (cnt < arr.length) {
		        arr[cnt] = 0;
		        cnt++;
		    }

		    System.out.println(Arrays.toString(arr)); 
	}
	public void show5() {
		int a[]= {4,6,5,2,89};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}System.out.println(a[i]);
			}
		}

	public static void main(String[] args) {
		
		MulTryBlock m=new MulTryBlock();
		//m.show();
		m.show2();
//		try {
//			int a=6;
//			int b=0;
//			int c;
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(RuntimeException e) {
//			System.out.println("Arithemetic exception");
//		}
//		catch(Exception e1) {
//			System.out.println("other exception ");
//		}
//		finally {
//			String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };
//			System.out.println("Duplicate string from array "); 
//			for (int i=0;i<arr1.length;i++) {
//				 for(int j=i+1;j<arr1.length;j++) {
//					 if(arr1[i]==arr1[j] )
//						 
//						 System.out.println(arr1[i]);
//				 }
//			 }
//		}
	}
}

