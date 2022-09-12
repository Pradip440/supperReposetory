import java.util.Scanner;
public class average5 {

	public static void main(String[] args) {
		System.out.println("Enter five number : ");
		Scanner sc=new Scanner (System.in);
		float a,b,c,d,e, avg;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		avg=(a+b+c+d+e)/5;
		
		System.out.println("Average of five number is :  "+avg);

	}

}
