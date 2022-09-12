import java.util.ArrayList;

class RevArrayList{
	
	public ArrayList<Integer> reverseArrayList (ArrayList<Integer> l){
		
		 ArrayList<Integer> revArrayList =new ArrayList<Integer>();
		 
		 for(int i =l.size()-1;i>=0;i--) {
			 
			 revArrayList.add(l.get(i));
		 }
		 return revArrayList;
	}
	public void printlnElements(ArrayList<Integer>l) {
		
		for (int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i)+" ");
		}
	}
	
		
}
public class ArrayListReverse {

	public static void main(String[] args) {
		
		RevArrayList obj=new RevArrayList();
		
			ArrayList<Integer> a =new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(16);
		a.add(10);
		a.add(11);
		a.add(12);
		System.out.print("original ");
		obj.printlnElements(a);
		
		a=obj.reverseArrayList(a);
		System.out.print("after reversing : ");
		obj.printlnElements(a);
		
//		System.out.println("even element of arrayList");
//		obj.evenElements();
//		System.out.println("sum of even element ");
//		obj.sumOfEvenElements();
	}
}


/*
public void evenElements() {
	ArrayList<Integer> a=new ArrayList<>();
	
	System.out.println(a);
	for(int i=0;i<=14;i++) {
		if(i%2!=0) {
			a.add(i);
		}
	}
	System.out.println(a);
}
public void sumOfEvenElements() {
	ArrayList<Integer> l=new ArrayList<>();
	
	System.out.println(l);
	int sum=0;
	for(int i=0;i<=14;i++) {
		if(i%2!=0) {
			l.add(i);
			sum+=i;
			
		}
	}
	System.out.println(sum);
}*/
