package stringconcate;

import java.util.Scanner;

class ValidMobileNumber{
	public static boolean ValidMobileNumbers(String pass) {
		 boolean result=pass.matches(" [0-9][/d] {10} ");
		 
		 return result;
		 
	}
	 void show() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number : ");
		 String s=sc.next();
		 if (ValidMobileNumbers(s))
			 System.out.println("valid");
		 else
			 System.out.println("not valid");
	 }
	 
}

public class CmpareToMethod {

	public static void main(String[] args) {
		
		ValidMobileNumber v=new ValidMobileNumber();
		v.show();
//		String s= " hello";
//		String s1=" hello";
//		String s2=" Hello";
//		String s3=" jello";
//		System.out.println(s.compareTo(s1));
//		System.out.println(s.compareTo(s2));
//		System.out.println(s.compareTo(s3));
		
		
	}

}
