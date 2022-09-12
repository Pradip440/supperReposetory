package HashMap;
import java.util.*;  
class HashMap3{ 
	public void showAllDetail() {
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		       
		      System.out.println("After invoking put() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
	}
	public void showDetail() {
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(102, "Gaurav");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	     System.out.println("Updated list of elements:");  
	     hm.replace(101, "Vijay", "Ravi");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }   
	     System.out.println("Updated list of elements:");  
	     hm.replaceAll((k,v) -> "Ajay");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	}
	
	
	public static void main(String args[]){  
		HashMap3 h=new HashMap3();
		h.showDetail();
		h.showAllDetail();
 }  
}  

