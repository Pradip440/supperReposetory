
public class Student1 {
	int roll,m1,m2;
	String name,grade;
	public void showdetail()
	{
		System.out.println("Roll :" +roll +" M1 :"+ m1 +"M2 : " +m2 +"Name :"+ " modi" + " Grade :"+ " A" );
		
	}
    public void acceptDetail(int r, int marks1,int marks2,String n,String g) 
    {
    	m1=marks1;
    	m2=marks2;
    	roll=r;
    	name=n;
    	grade=g;
    	System.out.println("object initialized");
    }
    public static void main( String [] args) 
    {
    	Student1 n =new Student1();
    	n.acceptDetail(23,87,98,"modi","A");
    	n.showdetail();
    }
}
