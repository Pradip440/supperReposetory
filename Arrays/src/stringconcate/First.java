package stringconcate;

import java.util.Scanner;

public class First {

	public void addStr(String s ,String s1)
	{
		String s2 ="";
		for (int i=0;i<s.length();i++)
		{
			s2=s2+s.charAt(i);
		}
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
	public void removeChar ( String s) {
		String s1= "";

		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			
			if (s.charAt(i)!=ch)
				s1=s1+s.charAt(i);
		}
		System.out.println("after removing char : : " + s1);
		
	}
	static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st :   " );
		String s=sc.next();
		System.out.println("Enter 2st : ");
		String s1=sc.next();
		First o =new First();
		o.addStr(s,s1);
		o.removeChar(s1);
	}

}
