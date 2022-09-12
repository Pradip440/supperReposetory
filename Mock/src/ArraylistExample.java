import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArraylistExample {
public void show() {
	List<Integer> l=new ArrayList<Integer>();
//	l.add(1);
//	l.add(20);
//	l.add(3);
//	l.add(4);
//	l.add(60);
	   //l.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
	   l.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,0}));
	//System.out.println(l);
	Iterator<Integer> itr= l.iterator();
	int sum=0;
	int avg;
	while(itr.hasNext()) {
		
		Integer i=itr.next();
		//if(i%2==0)
			//itr.remove();
			sum+=i;
			
			}
	avg=sum/l.size();
	System.out.println(avg);
		
//	for(int i=0;i<l.size();i++) {
//		
//			System.out.println(l.get(i));
//		
//	}

//	Set<Integer> l1=new HashSet<>(l);
//	System.out.println(l1);
}


	public static void main(String[] args) {

		ArraylistExample e=new ArraylistExample();
		//e.show();
		
		      ArrayList<Integer> al= new ArrayList<>();
		     al.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,0}));

//		      Scanner sc= new Scanner(System.in);
//		      System.out.println("enter  numbers: ");
//		      for(int i=0;i<5;i++)
//		      {
//		      	al.add(sc.nextInt());
//		      }
//		      Iterator<Integer> itr= al.iterator();
//		  	   while(itr.hasNext()) {
//		  	     	Integer i=itr.next();
//		  	     	if(i%2==0)
//		  			itr.remove();	
//		  	     
//		  	   }
//		  	 
//		     for(int j=0;j<al.size();j++) {
//		    	
//		  	   System.out.print(al.get(j)+" ");
//		     }
		   	al.removeIf(b -> b%2==0);
		    for(int j=0;j<al.size();j++) {
			  	   System.out.print(al.get(j)+" ");
			     }
		      	
		     
				
	}

}
