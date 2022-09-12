
//Java program to demonstrate inheritance in
//interfaces.
import java.io.*;
interface intfA
{
	void geekName();
}

 interface intfB extends intfA
{
	void geekInstitute();
}
 abstract class A {
	 void run() {
		 System.out.println("run");
	 }
 }
  class B extends A implements intfB{

	@Override
	public void geekName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void geekInstitute() {
		// TODO Auto-generated method stub
		
	}
	 
 }

//class implements both interfaces and provides
//implementation to the method.
class ExampleInterface implements intfB
{
	@Override
	public void geekName()
	{
		System.out.println("Rohit");
	}

	@Override
	public void geekInstitute()
	{
		System.out.println("JIIT");
	}

	public static void main (String[] args)
	{
		ExampleInterface ob1 = new ExampleInterface();

		// calling the method implemented
		// within the class.
		ob1.geekName();
		ob1.geekInstitute();
	}
}
