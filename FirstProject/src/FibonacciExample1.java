
public class FibonacciExample1 {  
		public static void main(String args[])  
		{    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);        
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
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