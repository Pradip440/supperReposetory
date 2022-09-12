package LinkedHashMap;
import java.util.*;  
class Example1{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(103,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
