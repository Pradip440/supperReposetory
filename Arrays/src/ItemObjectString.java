

public class ItemObjectString {
	
		int id,cost;
		String name,supplier;
		public ItemObjectString(int i, int j, String s, String s2) 
		{
			 id = i;
			 cost=j;
			 name=s;
			 supplier=s2;
		}
		public String toString()
		{
			String Str= "ID :" + id + "\ncost :  "+   cost + "\nsupplier : " + "supplier" +
					"\nname : "+   name;
			return Str;
		}
	
	
		 public static void main(String[] args)
		 {
			 ItemObjectString i= new ItemObjectString(120,1200,"akash","nikash");
			 System.out.println(i);
			 ItemObjectString i2= new ItemObjectString(120,1200,"akash","nikash");
			 System.out.println(i2);
			 System.out.println(i==i2);
			 
			 
		 }
		}
