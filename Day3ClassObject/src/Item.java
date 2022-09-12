
public class Item {
	int id,cost;
	String name,supplier;
	public void acceptItemDetail(int id ,int c,String iron,String raj  )
	{
		this.id=id;
		name=iron;
		cost=c;
		supplier=raj;
	}
	public void showDetail()
	{
		System.out.println("item id is "+id);
		System.out.println("item name is "+"iron");
		System.out.println("cost of itemis "+cost);
		System.out.println("supplyer name is "+"raj");
	}
	
	
	

}
