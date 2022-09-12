import java.util.Scanner;
public class GradePrcent {

			public static void main(String[] args) {
		     int a,b,c,d;
		     Scanner sc= new Scanner (System.in);
		     System.out.println("Enter percentage ");
		     double percentage = sc.nextDouble();
		     if (percentage >=90)
		     {
		    	 System.out.println("A+ grade");
		     }
		     else if (percentage >=80)
		     {
		    	 System.out.println("A grade");

		     }
		     else if (percentage >= 70 )
		     {
		    	 System.out.println("B grade");

		     }
		     else if (percentage >= 60)
		     {
		    	 System.out.println("C grade");

		     }
		     else if (percentage >= 50)
		     {
		    	 System.out.println("D grade");

		     }
		     else
		    	 System.out.println ("failed");
	}

}
