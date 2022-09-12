import java.util.InputMismatchException;
import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array");
		int a[]=new int[5];
		int total=0;
		try {
			for (int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				 total += a[i];
			}
			int avg=total/a.length;
			System.out.println(avg);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please give array elements length as given ");
			System.out.println("exception type : "+e.getClass());
			System.out.println("Error massage is : " + e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("Please give numeric input ");
			System.out.println("exception type : "+e.getClass());
			System.out.println("Error massage is : " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Please give numeric input ");
			System.out.println("exception type : "+e.getClass());
			System.out.println("Error massage is : " + e.getMessage());
		}

	}

}
