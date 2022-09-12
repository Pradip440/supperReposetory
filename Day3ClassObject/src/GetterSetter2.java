
public class GetterSetter2 {
	private int id,cost;
	private String name, supplier;;
	
	public void setId(int id)
	{
			this.id=id;
	}
	public int  getId() 
	{
		return id;
	}
	public void setCost(int cost)
	{
			this.cost=cost;
	}
	public int  getCost() 
	{
		return cost;
	}
	public void setName(String name)
	{
			this.name=name;
	}
	public String  getName() 
	{
		return name;
	}
	public void setSupplier(String supplier)
	{
			this.supplier=supplier;
	}
	public String  getSupplier() 
	{
		return supplier;
	}
	
	public void acceptItemDetail(int id ,int c,String iron,String raj  )
	{
		this.id=id;
		name="iron";
		cost=c;
		supplier=raj;
	}
	public void showDetail()
	{
		System.out.println("item id is "+id);
		System.out.println("item name is "+name);
		System.out.println("cost of itemis "+cost);
		System.out.println("supplyer name is "+supplier);
	}
	public static void main(String[] args)
	{
		GetterSetter2 i= new GetterSetter2();
		i.setId(111);
		i.setCost(100000);
		i.setName("Veera");
		i.setSupplier("MakanLal");
		System.out.println("Id is :" + i.getId()  );
		System.out.println("cost is :" + i.getCost()  );
		System.out.println("Name  is :" + i.getName()  );
		System.out.println("supplier name is :" + i.getSupplier()  );
	}
}
