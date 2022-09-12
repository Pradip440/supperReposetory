package TreeMap;

import java.util.Collections;
import java.util.TreeMap;

public class TwoTreeMapLIst {
 void show() {
	 TreeMap<Integer,String> map=new TreeMap(Collections.reverseOrder());

		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		map.put(4,"four");
		map.put(5,"five");
		System.out.print("List of map : "+map);
		
	 TreeMap<String,Integer> map2=new TreeMap(Collections.reverseOrder());
		map2.put("one",1);
		map2.put("two",2);
		map2.put("three",3);
		map2.put("four",4);
		map2.put("five",5);
		System.out.println("list of map2 : " + map2);
 }
 public static void main(String[] args) {
	 TwoTreeMapLIst a =new TwoTreeMapLIst();
	 a.show();
 }
}
