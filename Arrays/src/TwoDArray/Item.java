package TwoDArray;

import java.util.Arrays;

public class Item {
	int id,cost;
	String name,supplier;
	public String toString()
	{
		String Str= "ID :" + id + "\ncost :  "+   cost + "\nsupplier : " + "supplier" +
				"\nname : "+   name;
		return Str;
	}
	 public Item(int id, int c,String s,String n) 
	    {
	    	this.id=id;
	    	cost=c;
	    	supplier=s;
	    	name=n;   	
	    }
	 public void show()
	 	{
			System.out.println("item id is "+id);
			System.out.println("item name is "+ name);
			System.out.println("cost of items "+cost);
			System.out.println("supplyer name is "+supplier);
	 	}	
}
   
class object{
    	public void accept(Item[] i)
    	{
    		
    		i[1]= new Item(123,12000,"ok","fonti");
    		i[2]= new Item(123,12000,"bk","mon");
    		i[3]= new Item(123,12000,"tk","sonti");
    	}

    	
		public void show(Item[] i)
    	{
    		System.out.println(Arrays.toString(i));
    	}
 
	public static void main( String [] args) 
    {
    	Object s=new Object();
    	
    	Item i[] =new Item[4];
//    	 s.accept(i);
//    	
//    	s.show(i);
//    	
    	 
    }


	

    }
