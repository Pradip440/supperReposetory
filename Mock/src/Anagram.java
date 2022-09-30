import java.util.Arrays;

public class Anagram {

	public void isAnagram(String str1, String str2) {
		String s1=str1;
		String s2=str2;
		boolean flag=true;
		if(str1.length()!=str2.length()) {
			flag=false;
		}
		else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			//char[] ArrayS1=s1.toLowerCase().toCharArray();
			//char[] ArrayS2=s2.toLowerCase().toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    flag=Arrays.equals(ch1,ch2);
		}
		if(flag) {
			System.out.println("are anagram");
		}
		else {
			System.out.println("are not anagram");
		}
			
	}
	
	public void show2(String str1,String str2) {
		 String s1=str1;
		 String s2=str2;
		 boolean flag=true;
		 if(str1.length()!= str2.length()) {
			 flag=false;
		 }
		 else {
			 char ch[]=s1.toLowerCase().toCharArray();
			 char ch2[]=s2.toLowerCase().toCharArray();
			 Arrays.sort(ch);
			 Arrays.sort(ch2);
			 flag= Arrays.equals(ch, ch2);
		 }
		 if(flag) {
			 System.out.println("are anagram");
		 }
		 else {
			 System.out.println("are not anagram");
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram a=new Anagram();
		a.isAnagram("peek", "keep");
	}

}
