class All{
	//String Concat
	String s1 = "Sachin";
	String s2 =" Tendulakar";
	String s3 = "Sachin";
	public  void concat() {
	
	String s3=s1.concat(s2);
	System.out.println(s3);
	System.out.println("String length of s1 is :"+s1.length());
	System.out.println("String length of s2 is :"+s2.length());
	
	}
	public void StringLength() {
		System.out.println(s1.length());
		System.out.println("Compare to mehtod :"+ s1.compareTo(s3));
	}
}
	
public class AllStringInOne {

	public static void main(String[] args) {
		All a=new All();
		a.concat();
		a.StringLength();
	}

}
