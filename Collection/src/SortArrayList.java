import java.util.*;
class ArrayList1{
	
	void showList() {
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Mango");  
		list1.add("Apple");  
		list1.add("Banana");  
		list1.add("Grapes");
		list1.add("Grapes");
  
		Collections.sort(list1);  
//		System.out.println("for  loop -------------");
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
	
		System.out.println("for each loop -------------");
		for(String fruit:list1)  
			System.out.println(fruit);  

	//occurence of each string
			System.out.println("Occurence of each string object");
			
			ListIterator<String> itr= list1.listIterator();
			for(int i=0;i<list1.size();i++) {
				if (list1.get(i)==null) 
					continue;
					int cnt=1;
					for(int j=i+1;j<list1.size();j++) {
						if(list1.get(i).equals(list1.get(j))) {
							cnt++;
							list1.set(j,null);
						}
					}
				System.out.println(list1.get(i) + " "+cnt);
			}
			System.out.println("Sorting numbers...");  
			//Creating a list of numbers  
			List<Integer> list2=new ArrayList<Integer>();  
			
			list2.add(21);  
			list2.add(11);  
			list2.add(51);  
			list2.add(1); 
			list2.add(51);
			Collections.sort(list2);  
 //Traversing list through the for-each loop  
			for(Integer number:list2)  
				System.out.println(number); 
			Collections.sort(list2,Collections.reverseOrder());
			System.out.println("sorting in reverse order :\n"+list2);
			//ListIterator<Integer> itr1= list2.listIterator();
			for(int i=0;i<list2.size();i++) {
				if (list2.get(i)==null) 
					continue;
					int cnt=1;
					for(int j=i+1;j<list2.size();j++) {
						if(list2.get(i).equals(list2.get(j))) {
							cnt++;
							list2.set(j,null);
						}
					}
				System.out.println(list2.get(i) + " "+cnt);
			}			
	}
}
class SortArrayList{  
 public static void main(String args[]){  
	 ArrayList1 a=new ArrayList1();
	 a.showList();  
 }  
   
}  

