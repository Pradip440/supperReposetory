package TreeMap;
//Java program to demonstrate how to sort TreeMap of custom class objects
import java.util.*;

class Student {

	 String name;
	 int marks;

	public Student(String name, Integer marks)
	{
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		
		return this.name; 
		}

	public Integer getMarks() {
		
		return this.marks;
		}
	 @Override
	public String toString()
	{
		return this.name + ": " + marks;
	}
}

class AccordingMarks implements Comparator<Student> {
	
	public int compare(Student s1, Student s2)
	{
//		if(s1.marks<s2.marks)
//			return -1;
//		else if(s1.marks>s2.marks)
//			return 1;
//		else {
//		return s1.getName().compareTo(s2.getName());
//		}
		return s1.marks-s2.marks;
				
		}
}
public class Example2Comparator {
	
	public static void main(String[] args) {
		
		TreeMap<Student, Integer> map = new TreeMap<>(new AccordingMarks());

		map.put(new Student("Akshay", 500), 1);
		map.put(new Student("Bina", 400), 2);
		map.put(new Student("Chintu", 300), 3);

		System.out.println("TreeMap keys sorting in ascending order of the marks:");

		for (Map.Entry<Student, Integer> entry :map.entrySet()) {
			
			System.out.println("Key : (" + entry.getKey()+ "), Value : "+ entry.getValue());
		}
	}
}
