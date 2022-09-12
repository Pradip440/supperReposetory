package Day5Containment;

public class ResultEmployee {
	public static void main(String args[]) {
//	 { 
//		 YearOfBirth1 dob =new YearOfBirth1( 1998,16,04);
//		 Employee e =new Employee(11111111,"pradip", dob);
//		 System.out.println(e);
//	 }
	
	YearOfBirth1 o =new YearOfBirth1( 1998,16,04);
	 EmployeeGetSet e =new EmployeeGetSet();
	 e.setEName("pradip");
	 System.out.println( "Employeee name is : " + e.getEName());
	 e.setId(100001);
	 System.out.println( " Employee id is : " + e.getId());
	 e.setDob(o);
	 System.out.println( " Employee DOB is : " +e.getDob());
	 
}
}