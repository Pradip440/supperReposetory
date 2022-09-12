import java.util.*;
/*Ways to iterate the elements of the collection in Java
There are various ways to traverse the collection elements:
*/
class ArrayList4{
	void ShowArrayListAllLoop(){
		
		 ArrayList<String> list=new ArrayList<String>();
		 
         list.add("Ravi"); 
         list.add("Vijay");  
         list.add("Ravi");  
         list.add("Ajay");  
          
         System.out.println("Traversing list through  Iterator:");  
         Iterator <String> itr=list.iterator();
         while(itr.hasNext()) {
        	 String str=itr.next();
        	 System.out.println(str);
         } 
//      System.out.println("Traversing list through for loop:");  
//            for(int i=0;i<list.size();i++)  
//         {  
//          System.out.println(list.get(i));     
//         }  
//         System.out.println("using inhance for loop");
//         for(String str:list) {
//        	 System.out.println(str);
//         }
	}
}
public class ArrayListForAllLoop {

	public static void main(String args[]){  
		
		ArrayList4 a=new ArrayList4();
		a.ShowArrayListAllLoop();
	}
}  