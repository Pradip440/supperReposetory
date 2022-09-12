package stringconcate;

import java.util.Scanner;
// manually method
public class Third {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st :   " );
		String s=sc.next();
		System.out.println("Enter 2st : ");
		String s1=sc.next();
		Third o =new Third();
		o.addStr(s,s1);
	}

}
