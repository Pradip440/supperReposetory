package TwoDArray;

public class Student {
	static int cnt=1000,objectcount;
	int roll,m1,m2;
	String name,grade;
	 public Student(String string, int i, int j, int k, String string2) 
     {
			name=string;
			roll=i;
			m1=j;
			m2=k;
			grade=string2;
	 }
	public String toString()
	{
		String Str= "Grade :" +" A " + "\nmark1 :  "+   m1 + "\nmarks2 : " + m2 +
				"\nname : "+   name;
		return Str;
	}
	
	 public static void main( String [] args) 
    {
  	Student n=new Student("AJBhai", 100, 80, 90, "A");
  	System.out.println(n);
	    	
    }
}
