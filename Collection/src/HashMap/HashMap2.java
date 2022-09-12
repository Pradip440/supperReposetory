package HashMap;

import static java.util.stream.Collectors.toMap;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map; 
import java.util.function.Function; 

public class HashMap2 { 
	public static void main(String[] args) throws Exception {
		
		List<String> listOfString = new ArrayList<>();
	
		listOfString.add("Java"); 
		listOfString.add("JavaScript"); 
		listOfString.add("Python");
		listOfString.add("C++"); 
		listOfString.add("Ruby"); 
		
		System.out.println("list of string: " + listOfString);
		Map<String, Integer> map = new HashMap<>(); 
		for (String str : listOfString) { 
			map.put(str, str.length()); 
		}
		System.out.println("generated map: " + map); 
		
		// using lambda expression
		
		Map<String, Integer> map8 = listOfString.stream().collect( toMap(s -> s, s -> s.length()));
	
		System.out.println("generated map: " + map);
		// using method reference
		map8 = listOfString.stream().collect( toMap(Function.identity(), String::length)); 

		HashMap<String, Integer> hash = listOfString.stream() .collect( toMap(Function.identity(), String::length, 
				(e1, e2) -> e2, HashMap::new)); 
		System.out.println("generated hashmap:" + hash); 
		
		} 
	
	
}




//// convert list with duplicate keys to HashMap 
//listOfString.add("Java"); System.out.println("list of string with duplicates: " + listOfString);

//keep the order same as original list while conversion
//LinkedHashMap<String, Integer> linked = listOfString.stream().collect( toMap(Function.identity(), String::length, (e1, e2) -> e2, LinkedHashMap::new));
//System.out.println("generated linkedhashmap:" + linked); 

