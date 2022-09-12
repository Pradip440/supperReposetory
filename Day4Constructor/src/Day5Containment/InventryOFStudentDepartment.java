package Day5Containment;
public class InventryOFStudentDepartment {
	public static void main(String args[]){
	
		    Student s1 = new Student();
		    Department d1 = new Department();  
		    d1.setDid(100);
		    d1.setDName("MIET");
		    s1.setSid(10001);
		    s1.setSName("pradip");
		    s1.setDm(d1);
		    System.out.println("Department id:"+d1.getDid());
		    System.out.println("Department name:"+d1.getDName());
		    System.out.println("Student id:"+s1.getSid());
		    System.out.println("Student name:"+s1.getSName());
		    
		}	
		
	}


