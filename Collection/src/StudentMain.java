import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//sorting through Comparable
 class Student implements Comparable<Student>{
	int roll;
	String name,address;
	
	Student(int r ,String name, String address)
	{
		this.roll=r;
		this.name=name;
		this.address=address;	
	}
	public String toString() {
		return roll+" "+name+" "+address;
	}
    public int compareTo(Student a) {
    	
    	if (this.roll<a.roll)
    		return -1;
    	else if (this.roll>a.roll)
    		return +1;
    	else 
    		return 0;
    }
	
	
}
public class StudentMain {

	public static void main(String[] args) {
		List<Student> ar=new ArrayList<Student>();
		ar.add(new Student(112,"bbb","london"));
		ar.add(new Student(110,"bbb","london"));
		ar.add(new Student(109,"bbb","london"));
		ar.add(new Student(111,"bbb","london"));
		System.out.println(ar+"\n");
		System.out.println("unsorted.....\n");
		for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		Collections.sort(ar );
		System.out.println("\nSorted by rollNo : \n");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			
		//	Collections.sort(ar, Collections.reverseOrder());
//
//			System.out.println("\nSorted by rollno using collection reverse order");

		}
	}
		
			

}
