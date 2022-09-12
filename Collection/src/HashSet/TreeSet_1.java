package HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_1 {
 
	public void show1() {
		
	 TreeSet<Integer> ts = new TreeSet<Integer>();
	 
	 ts.add(10);
	 ts.add(20);
	 ts.add(30);
     ts.add(40);
     System.out.print("TreeSet: ");
		for (Integer value : ts) {

			System.out.print(value + ", ");
		}
		System.out.println();
		
     NavigableSet<Integer> treereverse = ts.descendingSet();

     Iterator<Integer> iterator = treereverse.iterator();

     System.out.println("\nValues using DescendingSet:");
    
     while (iterator.hasNext()) {
        
    	 System.out.println("Value : " + iterator.next());
     }
 }
	public static void main(String[] args)
	{
		TreeSet_1 t=new TreeSet_1();
		t.show1();
	}

}
