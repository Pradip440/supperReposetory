
public class Eplyoyee {
 int id;
 String name;
 long mobile;
 String addresh;
 public void acceptdetail( int id , String shila, long no,String address) 
 {
	 this.id=id;
	      name =shila;
	      mobile=no;
	      addresh=address;
 }
   public void showDetail()
   {
	   System.out.println( +id);
	   System.out.println("" + "name");
	   System.out.println( +mobile);
	   System.out.println( " "+ " adddresh");
   }
   //inventry
   public static void main(String[] args) 
   {
	   Eplyoyee i= new Eplyoyee();
	   i.acceptdetail(34, "shila", 1234567890, "pune");
	   i.showDetail();
	   
   }
}
