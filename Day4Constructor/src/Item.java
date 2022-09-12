
public class Item {
	int id,cost;
	String name,supplier;
	Item ()
	{
		id=34564;
		name="PK";
		cost=12000;
		supplier="john";
	}
	Item(int id ,int c,String iron,String raj  )
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
	Item i= new Item();
	i.showDetail();
	Item u=new Item( 1,345677,"ramu","naresh");
	u.showDetail();
	Item m=new Item( 2,32345,"raju","nisha");
	m.showDetail();
}
}
