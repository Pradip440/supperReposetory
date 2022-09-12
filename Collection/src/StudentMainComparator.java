import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

 class Student1 implements Comparator<Student1>{
	int roll , age;
	String name,address;
	Student1(){
		roll=100;
		name="akash";
		age=23;

	}
	Student1(int r ,String name, String address, int age)
	{
		this.roll=r;
		this.name=name;
		this.address=address;
		this.age=age;
	}
	public String toString() {
		return roll+" "+name+" "+address + " "+age;
	}
//    public int compare(Student1 a ,Student1 b) {
//    	if(a.roll<b.roll)
//    		return -1;
//    	else if(a.roll>b.roll)
//    		return 1;
//    	else
//    		return 0;
//    }
	 public int compare(Student1 a ,Student1 b) {
	    	if(a.age<b.age)
	    		return -1;
	    	else if(a.age>b.age)
	    		return 1;
	    	else
	    		return 0;
	    }
	 
//	 public void occurenceOfStringObject() {
//		 List<Student1> ar1=new ArrayList<Student1>();
//			ar1.add( new Student1(1012,"bbb","london" , 24));
//			ar1.add( new Student1(1010,"bbb","london", 23));
//			ar1.add( new Student1(1009,"bbb","london",25));
//			ar1.add( new Student1(1011,"bbb","london",22));
//			System.out.println(ar1+"\n");
//			System.out.println("unsorted.....\n");
//			for (int i=0;i<ar1.size();i++)
//			{
//				System.out.println(ar1.get(i));
//			}
//		 System.out.println("Occurence of each string object");
//			
//			ListIterator<Student1> itr= ar1.listIterator();
//			for(int i=0;i<ar1.size();i++) {
//				if (ar1.get(i)==null) 
//					continue;
//					int cnt=1;
//					for(int j=i+1;j<ar1.size();j++) {
//						if(ar1.get(i).equals(ar1.get(j))) {
//							cnt++;
//							ar1.set(j,null);
//						}
//					}
//				System.out.println(ar1.get(i) + " "+cnt);
//			}
//	 }
	
}
 class StudentMainComparator {

	public static void main(String[] args) {
		
		
		
		List<Student1> ar1=new ArrayList<Student1>();
		ar1.add( new Student1(1012,"bbb","london" , 24));
		ar1.add( new Student1(1010,"bbb","london", 23));
		ar1.add( new Student1(1009,"bbb","london",25));
		ar1.add( new Student1(1011,"bbb","london",22));
		System.out.println(ar1+"\n");
		System.out.println("unsorted.....\n");
		for (int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		//sort by default constructor
		Collections.sort(ar1,new Student1());
		
		System.out.println("\nSorted by rollNo/age : \n");
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		//sort by Parameterized constructor
		Collections.sort(ar1,new Student1(001,"abc","nagpur",12));
		
		System.out.println("\nSorted by rollNo/age : \n");
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
	}

	
}

