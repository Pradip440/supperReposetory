package HashMap;
//Java program to convert a HashMap to an ArrayList

import java.util.*;

public class HashMapToArrayList {
	//HashMap to ArrayList
	public void showDetail() {
		
		HashMap<String, Integer> map = new HashMap<>();

			map.put("vishal", 10);
			map.put("sachin", 30);
			map.put("vaibhav", 20);

				// Finding the Set of keys from the HashMap
			Set<String> keySet = map.keySet();

			ArrayList<String> listOfKeys= new ArrayList<String>(keySet);

			Collection<Integer> values = map.values();

			ArrayList<Integer> listOfValues= new ArrayList<>(values);

			System.out.println(/*"The Keys of the Map are "+*/ listOfKeys);

			System.out.println("The Values of the Map are "+ listOfValues);
	}
// ArrayList to HashMap
		public  void arrayListToHashMap() {
			ArrayList<Integer> a=new  ArrayList<>();
			a.add(1);
			a.add(2);
			a.add(3);
			System.out.println(a);
			HashMap<Integer,Integer> hm=new HashMap<>();
			Iterator<Integer> itr=a.iterator();
			while(itr.hasNext()) {
				Integer i=itr.next();
				hm.put(i, 1);
			}
			System.out.println(hm);
		}

	
	public static void main(String[] args)
	{
		HashMapToArrayList h=new HashMapToArrayList();
		h.showDetail();
		h.arrayListToHashMap();
		
	}

}
