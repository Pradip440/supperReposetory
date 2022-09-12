// program for chaining
public class Item1 {
	 
		int id,cost;
		String name,supplier;
		Item1 ()
		{
			id=34564;
			name="PK";
			cost=12000;
			supplier="john";
		}
		Item1(int id ,int c,String iron  )
		{
						
		}
		Item1(int id ,int c,String iron,String raj  )
		{
			this.id=id;
			name=iron;
			cost=c;
			supplier=raj;
		}
		public void showDetail()
		{
			System.out.println("item id is "+id);
			System.out.println("item name is "+ name);
			System.out.println("cost of items "+cost);
			System.out.println("supplyer name is "+supplier);
		}
	public static void main(String[] args)
	{
		Item1 i= new Item1();
		i.showDetail();
		Item1 u=new Item1( 1,345677,"ramu","naresh");
		u.showDetail();
		Item1 m=new Item1( 2,32345,"raju","nisha");
		m.showDetail();
	}
	
}
