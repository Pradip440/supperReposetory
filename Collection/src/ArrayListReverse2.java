import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
 class RemoveIterator {
   public static void removeIterator() {
      ArrayList<String> l = new ArrayList<String>();
      l.add("rose");
      l.add("Ma");
      l.add("Guava");
      l.add("Orange");
      l.add("Peach");
     // System.out.println("The ArrayList elements are: " + l);
      //use of iterator 
     
    Iterator<String> itr =l.iterator();
	
		while(itr.hasNext()) {
		String o=itr.next();
		int size= o.length();
		if(size>=5) {
			itr.remove();
		}
	}
     System.out.println("After remove : "+l);
	
      //use of listIterator 1.next() method 2.previous () method
//      ListIterator<String>listiterator= l.listIterator(3);
//     
//      System.out.println("after 3rd element: " );
//     
//      while(listiterator.hasNext()) {
//    	  
//    	  System.out.println(listiterator.next());
//      }
//      System.out.println("ArrayList in Backword ");
//      while(listiterator.hasPrevious()) {
//    	  System.out.println(listiterator.previous());
//      }    
	}
}
public class ArrayListReverse2 {
	public static void main(String[] args) {
		RemoveIterator r=new RemoveIterator();
		RemoveIterator.removeIterator();
	}
}
