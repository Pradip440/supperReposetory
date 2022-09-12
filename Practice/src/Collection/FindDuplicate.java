package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class FindDuplicate {

	public void findAllDuplicate() {
		String s;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter String value : ");
		s=sc.nextLine();

		String str[]= s.split(" ");

		s="";

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length;i++) {

			Integer val = map.getOrDefault(str[i], 0);

			map.put(str[i], val+1);
		}
		Set<Entry<String, Integer>> entrySet=map.entrySet(); 
		
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		while(itr.hasNext()) 
		{
			Entry<String, Integer> e=itr.next();

			if(e.getValue() == 2) {
				s+=e.getKey()+" ";
			}
		}

		System.out.print(s+" ");

		sc.close();
	}

	public static void main(String[] args) {
		FindDuplicate f= new FindDuplicate();
		f.findAllDuplicate();
	}
}