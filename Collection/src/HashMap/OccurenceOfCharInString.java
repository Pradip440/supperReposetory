package HashMap;

//Java program to count frequencies of characters in string using HashMap
import java.util.*;
class OccurenceOfCharInString {
	
	 public void characterCount() {
		String str= "google";
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			}
			else {

				map.put(c, 1);
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	public void show() {
		String str = "GooGle";
		HashMap<Character, Integer> map= new HashMap<>();
		for(int i=0;i<str.length();i++) {

		Integer val= map.getOrDefault(str.charAt(i), 0);

		map.put(str.charAt(i), val+1);
		}
		System.out.println(map);
	}
	
	public static void main(String[] args) 
	{
		//String str = "GooGle";
		//characterCount(str);
		OccurenceOfCharInString o=new OccurenceOfCharInString();
	o.show();
	o.characterCount();
	}

}
