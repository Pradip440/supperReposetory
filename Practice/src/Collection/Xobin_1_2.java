package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class Xobin_1_2 {

	public void removeDuplicate() {
		ArrayList<Integer> al= new ArrayList<>();
	     al.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,2,3,4}));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter numbers: :");
//		for(int i=0;i<10;i++) {
//			
//		al.add(sc.nextInt());
//		}

	     LinkedHashSet<Integer> hs = new  LinkedHashSet<>(al);
		//System.out.println(hs);
	     hs.addAll(al);
	    al. clear();
	    al.addAll(hs);
	    System.out.println(al);
//		Iterator<Integer> itr = hs.iterator();
//		while(itr.hasNext())
//		{
//		Integer i= (itr.next());
//
//		System.out.print(i+" ");
//
//		}
		//sc.close();
	}
		
	public static void main(String[] args) {
		
		Xobin_1_2 x=new Xobin_1_2();
		x.removeDuplicate();
	}
}
