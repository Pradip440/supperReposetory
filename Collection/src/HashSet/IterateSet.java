package HashSet;
//Java program to iterate the HashSet
//using for loop

import java.util.*;

class HashsetIterate{
	void showList() {
		
		HashSet<Integer> set = new HashSet<>();

		set.add(2);
		set.add(1);
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);

		System.out.println("Iterate HashSet using for loop : ");
		for (Integer ele : set) {
			System.out.print(ele + " ");
		}
	}
	public void wordUse(String s) {
		String str[]=s.split(" ");
	       HashSet<String> set = new HashSet<>();
	       for(int i=0;i<str.length;i++) {
	    	   set.add(str[i]);
	       }
	       Iterator<String> itr1 = set.iterator();
	       while(itr1.hasNext()) {
	    	   System.out.println(itr1.next());
	       }
		    
	}
	
}
class IterateSet {
	public static void main(String[] args)
	{
		HashsetIterate h=new HashsetIterate();
		h.showList();	
		h.wordUse("\nShree Ram is god");
	}
}

