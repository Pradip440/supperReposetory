package Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;  
class Book1 {  
	int id;  
	String name,author;  
	int price;
	 	
	public Book1(int id, String name, String author, int price) {  
		this.id = id;  
		this.name = name;  
		this.author = author;    
		this.price = price;  
}  
	public int getId() {
		
		return this.id; 
		}
	public String getName() {
		
		return this.name; 
		}
	public String toString()
	{
		return this.id+" :"+this.name + ": " + author+" :"+price;
	}
}  
class AccordingId implements Comparator<Book1> {
	
	public int compare(Book1 s1, Book1 s2)
	{
		return s2.id-s1.id;
//		if(s1.id<s2.id)
//			return -1;
//		else if(s1.id>s2.id)
//			return 1;
//		else {
//		return s2.getName().compareTo(s1.getName());
//		}
	}
}
public class Book {  
	public static void main(String[] args) {  
     
	//	List<Book1> list=new ArrayList<Book1>();  
      
		Book1 b1=new Book1(104,"aHear Yourself","Prem Rawat",2000);  
		Book1 b2=new Book1(102,"cHow to prevent the Next Pandamic,","Bill Gates,",5600);  
		Book1 b3=new Book1(103,"bOperating System","Galvin",5000);     
	//	list.add(b1);  
	//	list.add(b2);  
		//list.add(b3);  
		TreeMap<Book1, Integer> tMap=new TreeMap<Book1,Integer>(new AccordingId());
		tMap.put(b1, 1);
		tMap.put(b2, 2);
		tMap.put(b3, 3);
		//System.out.println(tMap);
		System.out.println("TreeMap keys sorting in descending order of the marks:");

			for (Map.Entry<Book1, Integer> entry :tMap.entrySet()) {
				
				System.out.println("Key : (" + entry.getKey()+ "), Value : "+ entry.getValue());
			}
			
			
			HashMap<Integer,String> map=new LinkedHashMap<>();
			map.put(2, "Two");
			map.put(4, "Four");
			map.put(6, "Six");
			map.put(1, "One");
			System.out.println("According to Insertion order using LinkedHashMap :");

			for (Map.Entry< Integer,String> entry :map.entrySet()) {
				
				System.out.println("Key : (" + entry.getKey()+ "), Value : "+ entry.getValue());
			}
			
			
	}  
}