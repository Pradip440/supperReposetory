
public class Student {
	int roll,m1,m2;
	String name;
	public void acceptdetail(int r ,String ram,int math,int phy)
	{
		this.roll=r;
		     name=ram;
		     m1=math;
		     m2=phy;
	}
    public void    showDetail()
   {
	 System.out.println("student roll number is" +roll);
	 System.out.println("student name is " +"name");
	 System.out.println("student marks in m1 is : " + m1);
	 System.out.println("student marks in m2 is : " + m2);
   }
    public static void main( String [] args) 
    {
    	Student i =new Student();
    	i.acceptdetail(26, "ram" , 67, 76);
    	i.showDetail();
    }
}
