package TreeMap;
//Creating TreeMap objects using Comparable interface in Java

import java.util.*;

 class Employee implements Comparable<Employee> {

	int id;
	String name;

	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee e)
	{
		int diff = this.id - e.id;
		return diff;
	}
}
public class Example1 {

	public static void main(String[] args)
	{
		TreeMap<Employee, String> tm = new TreeMap<>();

		Employee e1 = new Employee(3, "Pathak");

		Employee e2 = new Employee(2, "Anshu");

		tm.put(e1, "First");
		tm.put(e2, "Second");

		for (Map.Entry<Employee, String> e :tm.entrySet()) {

			System.out.println(e.getKey().id + " "+ e.getKey().name + " "+ e.getValue());
		}
	}
}

