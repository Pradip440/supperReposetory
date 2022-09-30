package Collection;

public class Car {
 
	int id,price, year;
	String name,brand ;
	
	Car( int id, String name,String brand ,int price ,int year){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.year=year;
		
	}
	public String toString() {
		return id+" "+name+" "+brand+" "+price+" " +year;
	}
}
