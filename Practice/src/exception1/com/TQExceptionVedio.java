package exception1.com;

import java.util.InputMismatchException;

public class TQExceptionVedio {
 public void show(int x,int y) {
	 try {
		// int c=x/y;
		 //System.out.println(c);
		 int arr[]=new int[5];
		 System.out.println(arr[10]);
	 }
	 catch(ArithmeticException  | ArrayIndexOutOfBoundsException | InputMismatchException e) {
		 System.out.println(e);
	 }
	 catch(Exception e) {
		 System.out.println(e);
	 }
	 finally {
		 System.out.println("ahsgd");
	 }
	  
 }
 public void task3() {
	 int x=8;
	 int y=0;
	 int z=x/y;
	 System.out.println(z);
 }
 public void task2() {
	 task3();
 }
 public void task1() {
	try {
		task2();
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
	}
 }
	public static void main(String[] args) {
		TQExceptionVedio s=new TQExceptionVedio();
	//	s.show(10, 0);
		s.task1();		
	}

}
