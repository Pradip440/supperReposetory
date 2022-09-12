import java.util.*;  
//Get and Set ArrayList
class GetSet{
	void showGetSet() {
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  al.add("Man");
		  al.add("Mangoo");
		  al.add("Mango0");
		  al.add("Manugo");
		  al.add("Manguo");
		  al.add("Mangoa"); 
		  al.add("aMango"); 
		  al.add("Maango");
		  al.add("Mangaio");
		  al.add("Manaigo"); 
		  al.add("Maniago"); 
		  al.add("Maauango"); 
		  System.out.println("Returning element: \n"+al.get(2));
 
		  al.set(2,"Dates");  
  
		  for(String fruit:al)    
		    System.out.println(fruit);
	}
}
public class ArrayGetSet{  
	
	public static void main(String args[]){ 
		
		GetSet g=new GetSet();
		
		g.showGetSet();  
  
 }  
}  

