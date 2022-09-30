

class Address{

   
  String Street;
  String city ;
  String state;
  String country;
  
  Address(){
	  Street="IT park";
	  city="Nagpur";
	  state="Maharastra";
	  country="India";
  }
 public  String toString () {
	return Street +" "+city+" "+state+" "+country;
	  
  }
  
}    

 class Person{
	 int id,age,contact;
	 String name;
	 Address a;
	 
	 Person(int id,String name,int age,int contact,Address a){
		 this.id=id;
		 this.name=name;
		 this.age=age;
		 this.contact=contact;
		 
	 }
	 public String toString() {
		 return id+" "+age+" "+name+" "+contact+" "+a;
	 }
	 
 }
 
 public class ContainmentGetSet {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p=new Person(1,"sham",25,89765430,null) ;
			p.a.state;
		}

	}
 
 
 
 
 