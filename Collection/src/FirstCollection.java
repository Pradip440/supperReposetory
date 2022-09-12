import java.util.ArrayList;
import java.util.Iterator;

public class FirstCollection {
	int costID;
	String costName;
	int costAge;
	 
	FirstCollection(int id,String name,int age){
		costID=id;
		costName=name;
		costAge=age;
		
	}
	public String toString() {
		return costID+","+costName+","+costAge;
	}
}
	
//	public static void main(String[] args) {
//		FirstCollection f=new FirstCollection(34, "ravi", 27);
//		f.toString();
//	}
//
//}
