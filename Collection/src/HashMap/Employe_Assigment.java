package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee{
	Integer empId;
	String eName;
	Integer salary;
	public Employee() {}
	public Employee(int a,String s,int sal) {
		empId=a;
		eName=s;
		salary = sal;
	}
	public String toString() {
		return "id"+empId+"name"+eName+" Salary"+salary;
	}
}

public class Employe_Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l = new ArrayList<>();
		Employee emp = new Employee(100,"aman",120000);
		Employee emp1 = new Employee(200,"nilesh",220000);
		Employee emp2 = new Employee(100,"aman",120000);
		Employee emp3 = new Employee(300,"sandeep",20000);
		l.add(emp);
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Set<Map.Entry<Integer, Integer>> ent = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> itr = ent.iterator();
		Iterator<Map.Entry<Integer, Integer>> itr1 = ent.iterator();

		while(itr.hasNext()) {
			Employee e = (Employee) itr.next();
			Integer val = e.empId;
			while(itr1.hasNext())
			if(map.containsKey(val)) {
				//Integer newSal =
			}
		}

	}
}
