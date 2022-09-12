package Queue;
import java.util.*;  

class Book implements Comparable<Book>{  

	int id;  
	String name,author;  
	int price;
	
	Book(int id, String name ,int price) {  
		
		this.id = id;  
		this.name = name;  
		    
		this.price = price;  
	}  
	public String toString() {
		return id+" "+name +": "+" : "+price;
		
	}
	public int compareTo(Book b) {  
		
		if(price>b.price){  
			return -1;  
		}
		else if(price<b.price){  
			return 1;  
		}
		else{  
			return 0;  
		}  
	}  
}  
public class Book_priorityQ { 
	
	public static void main(String[] args) {  
		
		Queue<Book> pq=new PriorityQueue<Book>();  
    
		Book b1=new Book(121,"Math",800);  
		Book b2=new Book(233,"Physics",600);  
    	Book b3=new Book(101,"English Grammer",450);   
    	
    	pq.add(b1);  
    	pq.add(b2);  
    	pq.add(b3);  
    	System.out.println("Traversing the queue elements:");  
    
    	for(Book b:pq){  
    		System.out.println(b.id+" "+b.name+" "+b.price);  
    	}  
    	pq.remove();  
    	
    	System.out.println("After removing one book record:");  
    	
    	for(Book b:pq){  
    		System.out.println(b.id+" "+b.name+" "+b.price);  
        }  
	}  

}
