package HashMap;
import java.util.*;
class Book {
	int id;
	String name;
	int quantity;
	Book(int id,String name, int quantity ){
		this.id=id;
		this.name=name;
		this.quantity=quantity;	
	}
}
public class MapExample {
	public static void main(String[] args) {
		Map<Integer,Book> map=new HashMap<Integer,Book>();
		Book b1=new Book(101,"core Java",8);
		Book b2=new Book(102,"C#",4);
		Book b3=new Book(103,"OOPS",5);
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		for(Map.Entry<Integer, Book> entry:map.entrySet()) {
			 int  key = entry.getKey();
			 Book b=entry.getValue();
			 System.out.println(key+" Details:"); 
			 System.out.println(b.id+" "+b.name+" "+b.quantity+" ");
			// System.out.println("");
		}	
	}
}
