package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListSimpel {
	public void show() {
		int arr[]= {2,3,4,5,6,8,8,9,11,12};
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(12);
		a.add(5);
		a.add(7);
		a.add(7);
		a.add(9);
		a.add(11);
	//	a.addAll(a);
		System.out.println("ArrayList\n"+a);
		Collections.sort(a);
		System.out.println("sorted in ascending order :\n "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("sorted in reverese order :\n"+a);
		System.out.println("-------------even---------------");
		int sum=0;
		for(int i=0;i<arr.length;i++)	{
			if(arr[i]%2==0) {
				a.add(arr[i]);
				System.out.println(arr[i]);
				sum+=arr[i];
				}
		}
		System.out.println("sum of even number from arry\n"+sum);	
		Set<Integer> a1=new LinkedHashSet<>(a);
		a.clear();
		a.addAll(a1);
		System.out.println("without duplicate : "+a);
	}
	public static void main(String[] args) {
		ArrayListSimpel s=new ArrayListSimpel();
		s.show();

	}

}
