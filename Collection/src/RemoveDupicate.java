import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
class Duplicate{
	public void showList() {
		ArrayList<String> aList = new ArrayList<String>();
          aList.add("Apple");
          aList.add("Mango");
          aList.add("Banana");
          aList.add("Orange");
          aList.add("Peach");
          aList.add("Peach");
         System.out.println("The ArrayList elements are: "+aList);
//          	for (String s: aList) {
//          		System.out.println(s);
//          	}
          	Iterator<String> itr = aList.iterator();
          
          	while (itr.hasNext()) 
          	{
          	String	str = itr.next();
          		if (str.equals("Peach") )
          		{
          			itr.remove();
          			System.out.println("\nThe element peach"
          					+ " is removed"+aList);
          			break;
          		}
          	}
          	
//          	HashSet<String> s=new HashSet<>(aList);
//          System.out.println(s);
//        	System.out.println("\nAfter Removing method The ArrayList elements are: "+aList);
//  	       	for (String s: aList) {
//        	 		System.out.println(s);
//          	}
          	
	}
}
public class RemoveDupicate {
   public static void main(String[] args) {
	   
	   Duplicate d=new Duplicate();
	   
	   d.showList();
   }
}

