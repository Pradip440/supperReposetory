import java.util.Arrays;

public class NewProject {
 
 static void isAnagram(String str1,String str2){
	 String s1=str1;
	 String s2=str2;
	 
	 boolean flag=true;
	 
	 char ch1[]= s1.toLowerCase().toCharArray();
	 
	 char ch2[]= s2.toLowerCase().toCharArray();
	 
	 flag=Arrays.equals(ch1, ch2);
	 
	 if(flag) {
		 
		 System.out.println(s1+" and "+s2 +" are anagram");
	 }
	 else {
		 
		 System.out.println("are not an Anagram");
	 }
	 
	 
}
 
 public void show3() {
	  String str ="hi";
	   str="hellow";
	  System.out.println(str);
 }
	public static void main(String[] args) {
		NewProject n=new NewProject();
		n.show3();
	//	isAnagram("naman","naman");
	}

}
