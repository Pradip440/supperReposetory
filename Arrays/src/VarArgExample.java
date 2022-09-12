
public class VarArgExample
{
	public void show(int ...a)
	{
		System.out.println();
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ "");
		}
	}

	public static void main(String[] args) 
	{
		VarArgExample o=new VarArgExample();
		int a[]= {1,2,3,4,5};
		o.show(a);
		o.show(0,9,8,7,6,5);
		o.show();
		o.show(1,2,3,4,5,6,7,8,9);
		
	}

}
