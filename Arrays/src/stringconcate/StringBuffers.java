package stringconcate;

public class StringBuffers {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("parent ");
		s.append("child");
		System.out.println("append :"+s);
		
		s.insert(6, " child+");
		System.out.println("insert : "+s);
		
		s.reverse();
		System.out.println("reverse method : "+s);
		
		StringBuffer s1=new StringBuffer("parent ");
		StringBuffer s2=new StringBuffer("parent ");
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
	}

	
}
