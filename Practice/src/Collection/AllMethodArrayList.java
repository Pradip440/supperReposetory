package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AllMethodArrayList {
	void show1() {
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6);
//		for(Integer l:l1) {
//			System.out.println(l);
//		}
		Iterator<Integer> it=l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"  ");
		}
//		for(int i=0;i<l1.size();i++) {
//			System.out.println(l1.get(i));
//		}
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(21);
		list.add(23);
		list.add(22);
		list.add(24);
		System.out.println(list);
		Iterator<Integer> itr1=list.iterator();
		while(itr1.hasNext()) {
			int x=itr1.next();
			if(x>20)
				itr1.remove();
			}
		System.out.println("After remving : "+list);

		List<Integer> list1=new LinkedList<Integer>();
		list1.add(32);
		list1.add(34);
		System.out.println(list1);
		list1.remove(1);
		System.out.println("Aftr list1 remove"+list1);
	}
	public static void main(String[] args) {
		
		AllMethodArrayList a=new AllMethodArrayList();
		a.show1();
	}

}
