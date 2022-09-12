import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
     int a,b,c,d;
     Scanner sc= new Scanner (System.in);
     System.out.println("Enter four numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     d=sc.nextInt();
     if (a>b && a>c && a>d)
     {
    	 System.out.println("A is greater :" + a);
     }
     else if(b>a && b>c && b>d)
     {
    	 System.out.println("B is greater :" + b);
    	 
     }
     else if (c>a && c>b && c>d)
     {
    	 System.out.println("C is greater :" + c);
     }
     else
     
    	 System.out.println("D is greater : " + d);
     
	}

}
