
public class PolyMethodOver {
	public void acceptDetail(float x)
	{
		System.out.println("area ofcircle is " + 3.14*x);
	}
	public void acceptDetail(int x,int y)
	{
		System.out.println("area of Rectangle is " + x*y);
	}
	public float acceptDetail(float x,int y)
	{
		System.out.println("area of triangle is " + (x*y)/2);
		return (x*y)/2;
	}
	public static void main(String[] args)
	{
		PolyMethodOver i=new PolyMethodOver();
		i.acceptDetail(4);
		i.acceptDetail(4,5);
		i.acceptDetail(12f,4);
	}
}
