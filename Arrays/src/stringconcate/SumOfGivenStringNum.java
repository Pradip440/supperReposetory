package stringconcate;

import java.util.Scanner;

public class SumOfGivenStringNum {

	public  void sumOfStringDigit() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string ");
//		String str1= sc.nextLine();
		String str1= "23ram7vk35";
		char[] ch= str1.toCharArray();
		int sum=0;
		for (int i=0;i<ch.length;i++) {
			
			if(Character.isDigit(ch[i])) {
				
				String s=String.valueOf(ch[i]);
				int a=Integer.parseInt(s);
				sum+=a;
			}
		}
		System.out.println("sum of given string digit :" +sum);
		//sc.close();
	}
	public void show4() {
		String str= "2hs6jhd4j8hdh5";
		char ch[]=str.toCharArray();
		int sum =0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				String s=String.valueOf(ch[i]);
				int a =Integer.parseInt(s);
				sum+=a;
			}
		}
		System.out.println(sum);
	}
	 public void show5() {
		String str="huhdsd545jdgbjh4";
		char ch[]=str.toCharArray();
		int sum =0;
		for ( int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])){
				String  s= String.valueOf(ch[i]);
				int a=Integer.parseInt(s);
				sum+=a;
			}
		}
		System.out.println(sum);
	 }
	
	 public void show3() {
		 String str="dhf4jkh67jk5";
		 char ch[]=str.toCharArray();
		 int sum=0;
		 for(int i=0;i<ch.length;i++) {
			 if(Character.isDigit(ch[i])) {
				 String s=String.valueOf(ch[i]);
				 int a=Integer.parseInt(s);
				 sum+=a;
			 }
		 }
		 System.out.println(sum);
	 }
	public static void main(String[] args) {
		SumOfGivenStringNum s=new SumOfGivenStringNum();
		//SumOfGivenStringNum.sumOfStringDigit();
		//s.sumOfStringDigit();
		s.show3();
	}

}
