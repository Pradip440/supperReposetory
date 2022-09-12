import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Example {
	
	public static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> list) {
		
		HashMap<String ,Integer> hm =new HashMap<>();
		
		for(String str : list) {
			
			hm.put(str, str.length());
		}
		return hm ;
	}
	public static void main(String[] args)
	{
		ArrayList<String> list= new ArrayList<>();
		System.out.println("ArrayList");
		list.add("1");
		list.add("2");
		list.add("3");
		for (String num : list)
		{
		System.out.println(num);
		}
		System.out.println("HashMap");
		
		HashMap<String, Integer> numMap = convertArrayListToHashMap(list);
		for (Entry<String, Integer> entry : numMap.entrySet()) {

			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}	
//	 static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> list) {
//		HashMap<String ,Integer> hashMap =new HashMap<>();
//		for(String str : list) {
//			hashMap.put(str, str.length());
//		}
//		return hashMap ;
//	}
}
