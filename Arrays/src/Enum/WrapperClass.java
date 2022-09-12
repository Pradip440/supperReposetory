package Enum;

public class WrapperClass {

	public static void main(String[] args) {
		//boxing
		int a=10;
		Integer i=Integer.valueOf(a);
		Integer k=a;
		System.out.println(a+" "+i+" "+k);
		//unboxing
		Integer o=20;
		int j=o.intValue();
		int m=o;
		System.out.println(o+" "+j+" "+m);
	}

}
