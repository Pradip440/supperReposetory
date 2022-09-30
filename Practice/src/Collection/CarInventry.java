package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CarInventry {

	public static void main(String[] args) {
		
		ArrayList <Car> c= new ArrayList<Car>();
		
		 c.add( new Car(1,"cycle","Hero",5000,2000));
		 c.add (new Car(2,"Motorcycle","Tvs Apache",150000,2012));
		 c.add( new Car(3,"car","TATA",550000,2001));
		 c.add( new Car(4,"car","Maruti suzuki",550000,2001));

		 
		HashMap<String, Integer> cMap=new HashMap<String,Integer>();
		Iterator<Car> itr =c.iterator();
		 while (itr.hasNext()) {
			 Car c1=itr.next();
			 Integer val =cMap.getOrDefault(c1.name,0);
			 cMap.put(c1.name,val+1);
		 }
		 System.out.println(cMap);
	}
}

