import java.util.Scanner;

public class Assigment6 {

	public static void main(String[] args) {
		System.out.println("Enter  any month ");
		Scanner sc = new Scanner (System.in);
		int mon = sc .nextInt();
		switch (mon)
		{
		case 1 :
		case 5 :
		case 3 :
		case 7 : 
		case 10 :
		case 12 :
			     System.out.println("**31 Days **");
			     break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			     System.out.println( " **30 days ");
			     break;
		case 2 :
			    System.out.println( "**eithr 28 or 29 ");
			    break;
	    default : 
	    	System.out.println( "**invalid ");
	    	break;
		}
		

	}

}
