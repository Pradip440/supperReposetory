
public class PrimeNumber {
	
	static void checkPrime(int n)
	{
		int flag=0;
		for (int i=2;i<=n/2;i++) 
		{
			if (n%i==0)				
			{
				flag=1;
			    break;
			 }
		}
		if(flag==0)
		{
			System.out.println(n+ "  is  prime number");
		}
		else
		{
			System.out.println( n+" is not prime");
		}
	}	
	 public static void main(String[] args)
	 {
		
			checkPrime(2);
			checkPrime(3);
			 checkPrime(17);
			 checkPrime(22);
			 
		 
	 }
}

