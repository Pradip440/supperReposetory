package stringconcate;

import java.util.Scanner;

public class SumOfGivenStringNum {

	public  void sumOfStringDigit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str1= sc.nextLine();
		char[] ch= str1.toCharArray();
		int sum=0;
		for (int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				System.out.println("digits in the string : " + ch[i]);
				System.out.println();
				int a=Integer.parseInt(String.valueOf(ch[i]));
				sum+=a;
			}
		}
		System.out.println("sum of given string digit :" +sum);
		sc.close();
	}
	public static void main(String[] args) {
		SumOfGivenStringNum s=new SumOfGivenStringNum();
		//SumOfGivenStringNum.sumOfStringDigit();
		s.sumOfStringDigit();
	}

}
