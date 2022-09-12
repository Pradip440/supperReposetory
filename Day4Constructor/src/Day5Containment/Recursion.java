package Day5Containment;

import java.util.Scanner;

public class Recursion {
	 static Scanner sc=new Scanner(System.in);
static //	System.out.println("enter a number");
	 int num=sc.nextInt();
	public static  int add(int num) {
		if(num<=1) {
			return num;
		}
		return num+ add(num-1);	
	}
	public static void main(String[] args) {
		
		System.out.println(add(num));
	}
}
