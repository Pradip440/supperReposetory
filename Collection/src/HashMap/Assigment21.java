package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Departmentt {
	
	Integer id;
	String depName;
	List<Students1> s;
	
	public Departmentt() {}
	
	public Departmentt(Integer id , String name,List<Students1> ls) {
		this.id=id;
		depName=name;
		s = ls;
	}
	
	public String toString() {
		
		return "dep id "+id+" dep name "+depName+"s";
	}
}
class 	Students1 {
	
	Integer roll;
	String name;
	
	public Students1() {}
	
	public Students1(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return "roll "+roll+" name "+name;
	}
}

public class Assigment21 {

	public static void main(String[] args) {
	
		Students1 s1 = new Students1(100,"ram");
		Students1 s2 = new Students1(200,"rohan");
		Students1 s3 = new Students1(300,"jatin");
		
		List<Students1> sl = new ArrayList<>();
		
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		
		Departmentt d1 = new Departmentt(10,"electronics",sl);
		Departmentt d2 = new Departmentt(20,"digital",sl);
		Departmentt d3 = new Departmentt(30,"analog",sl);
		
		HashMap<Integer,Departmentt> map = new HashMap<>();
		map.put(1001, d1);
		map.put(1002, d2);
		map.put(1003, d3);
	
		Set<Map.Entry<Integer,Departmentt>> ent = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> itr = ent.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =itr.next();
			d.getKey();
			Departmentt dep = d.getValue();
			System.out.println("Department id :"+ d.getKey()+"\n"+dep.s);
		}

	}

}

