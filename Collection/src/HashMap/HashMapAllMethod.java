package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
//WAP to get only keys from a HashMap
public class HashMapAllMethod {
	
	HashMap<String,Integer > map=new HashMap<>();
	
	public void showKeySetMethod() {
		
	map.put("abc",100);
	map.put("bcd",102);
	map.put("zyx",103);
	Set<String> keys=map.keySet();
	for( String key : keys ) {
		System.out.println(key);
	}
	Collection<Integer> values = map.values();
	for( Integer value : values ) {
		System.out.println(value);
	}
	
	}
	public static void main(String [] args) {
		HashMapAllMethod h=new HashMapAllMethod();
		h.showKeySetMethod();
	}
}
