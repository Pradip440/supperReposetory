// WAP to find second minimum value in an array
public class Assigment2 {
	public  void secondMinimum()
	{  
		int a[]={-20,0,-25,15,19,37,23};
		int temp;  
		for (int i = 0; i < a.length-1; i++)   
		        {    
		                if (a[i] > a[i+1])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[i+1];  
		                    a[i+1] = temp; 
		                    i=-1;
		                }  		            
		        }  
		System.out.println("Second smallest: "+a[1]);
		      
		}  
		public static void main(String args[])
		{  
			Assigment2 a=new Assigment2();
			a.secondMinimum();
		}  
}
