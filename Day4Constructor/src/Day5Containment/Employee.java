package Day5Containment;
class Employee{
	int emp_id;
    String emp_name;   
	YearOfBirth1 dob ;
  Employee(){}
  Employee(int id, String name ,YearOfBirth1 dob){
    emp_id=id;
    emp_name=name;
     this.dob =dob;
  }
  public  String toString () {
	  return "employee ID is :  " + emp_id  +  "\nemployee name is :  " + emp_name + " \nDOB is : "+ dob;
  } 

}
//___________________________________________________________________-
//class YearOfBirth {
//	  int year, date,month;
//	  
//	  YearOfBirth (){}
//	  YearOfBirth(int y, int d , int m ){
//		  year=y;
//		  date=d;
//		  month=m;
//	  }
//	  public  String toString () {
//		  return  year +" "+date + " "+month ;
//	  }	
//}
//____________________________________________________________________






