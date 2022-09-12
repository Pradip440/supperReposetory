
public class Student 
{
	static int cnt=1000,objectcount;
		int roll,m1,m2;
		String name,grade;
       

//		public void showdetail()
//		{
//			System.out.println("Roll :" +roll +" M1 :"+ m1 +"M2 : " +m2 +"Name :"+ " modi" + " Grade :"+ " A" );
//			
//		}
//	    public void acceptDetail(int r, int marks1,int marks2,String n,String g) 
//	    {
//	    	m1=marks1;
//	    	m2=marks2;
//	    	roll=r;
//	    	name=n;
//	    	grade=g;
//	    	System.out.println("object initialized");
//	    }
//	    public static void main( String [] args) 
//	    {
//	    	Student n =new Student();
//	    	n.acceptDetail(23,87,98,"modi","A");
//	    	n.showdetail();
//	    }
		 public Student(String string, int i, int j, int k, String string2) 
	       {
				// TODO Auto-generated constructor stub
			}
		public String toString()
		{
			String Str= "Grade" +"A" + "mark1"+ m1 + "marks2" +m2 + "name"+ name;
			return Str;
		}
		
		 public static void main( String [] args) 
	    {
	    	Student n =new Student("A", 110 ,80 , 90, "aJ");
	    	System.out.println(n);
		    	
		    }
}
