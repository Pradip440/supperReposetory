package TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Item {
     int id;
	 String name;
	 int icost;

	public Item(int id,String name, Integer icost)
	{
		this.id=id;
		this.name = name;
		this.icost = icost;
	}
	public int getId() {
		
		return this.id; 
		}
	public String getName() {
		
		return this.name; 
		}

	public Integer getCost() {
		
		return this.icost;
		}
	 @Override
	public String toString()
	{
		return this.id+" :"+this.name + ": " + icost;
	}
}

class AccordingCost implements Comparator<Item> {
	
	public int compare(Item s1, Item s2)
	{
		if(s1.icost<s2.icost)
			return -1;
		else if(s1.icost>s2.icost)
			return 1;
		else {
		return s2.getName().compareTo(s1.getName());
		}
	}
}
public class ItemClass {
	
	public static void main(String[] args) {
		
		TreeMap<Item, Integer> map = new TreeMap<>(new AccordingCost());

		map.put(new Item(11,"a", 400), 1);
		map.put(new Item(22,"b", 400), 2);
		map.put(new Item(33,"c", 400), 3);

		System.out.println(
			"TreeMap keys sorting in descending order of the marks:");

		for (Map.Entry<Item, Integer> entry :map.entrySet()) {
			
			System.out.println("Key : (" + entry.getKey()+ "), Value : "+ entry.getValue());
		}
		
	}
}

