package stringconcate;

import java.util.Scanner;

public class SumOfBigNumberFromString {

	static void findSum(String str) {
		String temp="0";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp+=ch;	
			}
			else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println( sum +Integer.parseInt(temp));
	}
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str1= sc.nextLine();
		findSum(str1);
		//System.out.println("sum of all digits in given string : "+findSum(str1));
		sc.close();
	}

}
