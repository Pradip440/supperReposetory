package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListXobin {

	public static void main(String[] args) {
		
	    //DON NOT EDIT GIVEN CODE

			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(11);
			list.add(34);
			list.add(38);
			Scanner sc = new Scanner(System.in);
			int elementcounter = 0;
			
			for (int i = 0; i < list.size(); i++) {
				
				if(list.get(i)>9){ 
				elementcounter++;
						//System.out.println(list);
				}
				
			}
			System.out.println(elementcounter);

		}

}
