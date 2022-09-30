
public class FibonacciExample1 {  
public void show () {
	int n1=0,n2=1,n3,count=10;    
	 System.out.print(n1+" "+n2);        
	 for(int i=2;i<count;++i)   
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 } 
}
		public static void main(String args[])  
		{    
		 
		 //object for recurssion
		 A x=new A();
		 x.fubbi(0, 1, 100);
		} 
}
// by recurssion method
class A{
public void fubbi(int a,int b,int range) {
	if(a<=range) {
		//System.out.println("/n__________________");
		System.out.println(a+ " ");
		int c=a+b;
		a=b;
		b=c;
		fubbi(a,b,range);
	}
}
}