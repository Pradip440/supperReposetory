// Java Program to Demonstrate Working of Comparator Interface

import java.util.*;

class StudentS {

	int roll,age;
	String name, address;
	
	public StudentS(int rollno1, String name, int age) {
		
		roll = rollno1;
		this.name = name;
		this.age=age;
	}
	public String toString()
	{
		return this.roll + " " + this.name + " "
			+ this.age;
	}
}

class Sortbyroll implements Comparator<StudentS> {

	public int compare(StudentS a, StudentS b)
	{

		return a.roll - b.roll;
	}
}

class SortbynameS implements Comparator<StudentS> {

	public int compare(StudentS a, StudentS b)
	{

		return a.name.compareTo(b.name);
	}
}
class SortbyAge implements Comparator<StudentS> {

	public int compare(StudentS a, StudentS b)
	{

		return a.age-(b.age);
	}
}


public class ComparatorSorting {

	public static void main(String[] args)
	{

		ArrayList<StudentS> ar = new ArrayList<StudentS>();
		
		ar.add(new StudentS(111, "Mayank", 21));
		ar.add(new StudentS(131, "Anshul", 32));
		ar.add(new StudentS(121, "Solanki", 20));
		ar.add(new StudentS(101, "Aggarwal", 23));

		System.out.println("Unsorted");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student  by roll number
		
		Collections.sort(ar, new Sortbyroll());
		
		System.out.println("\nSorted by rollno");

		for (int i = 0; i < ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}

		// Sorting student by name
		Collections.sort(ar, new SortbynameS());

		System.out.println("\nSorted by name");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		// sorting student by age
		Collections.sort(ar, new SortbyAge());

		System.out.println("\nSorted by age");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		
	}
}
