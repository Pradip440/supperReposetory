interface Ab{
	 void show() ;
	 public static void show1() {
		 System.out.println("static method;");
	 }
	 abstract void draw();
}

 abstract class Shape implements Ab{
	public abstract void draw();

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("parent interface");
	}
}
 class Rectangle extends Shape{
	public void draw() {
		System.out.println("Draw a Rectangle ......");
	}
	public void show() {
		System.out.println("from A");
	}
}
 class circle extends Shape{
	public void draw() {
		System.out.println("draw a circle...........");
	}
}

public class TestAbstration {

	public static void main(String[] args) {
		Ab a = new Rectangle();
		a.draw();
		a.show();
		Ab.show1();
		a=new circle();
		a.draw();
		a.show();
	}

}
