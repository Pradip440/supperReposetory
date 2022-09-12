package HashMap;
//Java program to illustrate
//how hashCode() and equals() methods work
import java.io.*;

class Student1
{
	
	public String name;
	public int id;
		
	Student1(String name, int id)
	{
			
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
	if(this == obj)
			return true;
		
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		Student1 ee = (Student1) obj;
		
		return (ee.name == this.name && ee.id == this.id);
	}
	
	@Override
	public int hashCode()
	{
	
		return this.id;
	}
	
}

public class HashCodeEqualsMethod 
{
	
	public static void main (String[] args)
	{
	
		Student1 g1 = new Student1("aa", 1);
		Student1 g2 = new Student1("aab", 1);
		
		if(g1.hashCode() == g2.hashCode())
		{

			if(g1.equals(g2))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");
		}
		else
		System.out.println("Both Objects are not equal. ");
	}
}


