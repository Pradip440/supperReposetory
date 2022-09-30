import java.util.Scanner;

public class CheckPrime {
	public static void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number n1  is :");
		int n1=sc.nextInt();
		int flag=0;
		for (int i=2;i<=n1/2;i++) {	
			if (n1%i==0) {			
				flag=1; 
				break;
			}
		}
		if (flag==0)
			
			System.out.println(n1+ " is prime");
		else 
			System.out.println("not prime");
	sc.close();
	}
	static void check1() {
		String primenumbers=" ";
		int n=10;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter n :");
//		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int cnt=0;
			for(int num=i;num>=1;num--) {
				if(i%num==0) {
					cnt+=1;
				}
			}
			if(cnt==2) {
				primenumbers+=i+" ";
				
			}
		}
		System.out.println(primenumbers);
		//sc.close();

	}
		public static void main(String[] args ) {
		check();
//			check1();

		
	}
	
}
