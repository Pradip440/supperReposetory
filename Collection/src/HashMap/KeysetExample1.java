package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeysetExample1 {
	public void showKeySetWork() {
//	Map<Integer,String> map=new HashMap<>();	
//	Set<Integer> s=new HashSet<>();
	Map<String,Integer> map=new HashMap<>();
	Set<String> s=new HashSet<>();
//	map.put(1,"one");
//	map.put(2,"two");
//	map.put(3,"three");
//	map.put(4,"four");
//	map.put(5,"five");
	map.put("one",1);
	map.put("two",2);
	map.put("three",3);
	map.put("four",4);
	map.put("five",5);
	System.out.print("List of map : "+map);
	Map<String,Integer> map2=new HashMap<>();
	map2.put("one",1);
	map2.put("two",2);
	map2.put("three",3);
	map2.put("four",4);
	map2.put("five",5);
	System.out.println("list of map2 : " + map2);
	//equals method
	System.out.println("equiality :"+map.equals(map2));
	//method keySet
	s=map.keySet();
	System.out.println("method Keyset :"+s);
	// conatainsKey method
	System.out.println("two is present : "+map.containsKey("two"));
	System.out.println("seven is present : "+map.containsKey("seven"));
	//entrySet method
	System.out.println("entrySet method :\nthe set is :"+map.entrySet());
	
	//clear method
	map.clear();
	System.out.println("after use of clear method : "+map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeysetExample1 k=new KeysetExample1();
		k.showKeySetWork();
	}

}
