package Day5Containment;

public class InventryForInstitute {

	public static void main(String[] args) {
//		YearOfBirth1 o =new YearOfBirth1( 1998,16,04);
//		 EmployeeGetSet e =new EmployeeGetSet();
//		 e.setEName("pradip");
//		 System.out.println( "Employeee name is : " + e.getEName());
//		 e.setId(100001);
//		 System.out.println( " Employee id is : " + e.getId());
//		 e.setDob(o);
//		 System.out.println( " Employee DOB is : " +e.getDob());

		Branch obj1=new Branch();
		obj1.setName("prakas");
		 System.out.println( "student name is : " + obj1.getName());
		 obj1.setId(10000);
		 System.out.println( " student id is : " + obj1.getId());
//		Subject obj2=new Subject();
//		Topic obj3= new Topic ();
//		SubTopic obj4=new SubTopic();
//		Question obj5=new Question();
		Institute obj =new Institute();
		obj.setName("pradip");
		 System.out.println( "student name is : " + obj.getName());
		 obj.setId(100001);
		 System.out.println( " student id is : " + obj.getId());
		 obj.setB (obj1);
		 System.out.println(obj);
		 
	}

}
