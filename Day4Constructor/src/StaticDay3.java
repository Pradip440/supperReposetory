
public class StaticDay3
{
	public static int cnt=100,objectcnt;
	static float gst =18.5f;
		int id,cost;
		String name,supplier;
		StaticDay3 ()
		{
			this.id=id;
			name="PK";
			cost=12000;
			supplier="john";
			
		}
		StaticDay3(int id ,int c,String iron,String raj  )
		{
			this.id=id;
			name=iron;
			cost=c;
			supplier=raj;
		}
		public float calculateBill(int qty)
		{
			float bill =(qty*cost)*StaticDay3.gst;
			return bill;
			
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
		StaticDay3 i= new StaticDay3();
		i.showDetail();
		System.out.println("_____________________________");
		StaticDay3 u=new StaticDay3( 1,345677,"ramu","naresh");
		u.showDetail();	
		float uBill=u.calculateBill(10);
		System.out.println("Total pf bill is " +uBill);
		System.out.println("__________________");
		StaticDay3 m=new StaticDay3( 2,32345,"raju","nisha");
		m.showDetail();
		float mBill=u.calculateBill(5);
		System.out.println("Total pf bill is " +mBill);
		System.out.println("_____________________________");
		
	}
	
}

