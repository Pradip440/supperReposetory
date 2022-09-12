/*public class FindSumOfPower {

	public int countDigits(int x)
	{
		int cnt=0;
		while(x>0)
		{
			cnt++;
			x=x/10;
		}
		return cnt;
	}
	public int findPower(int base,int power) 
	{
	    int multi=1;
	    for(;power>=1;power--)
	    {
	    	multi=multi*base;
	    }
	    return multi;
	}
	/*public int calPowersSum(int number)
	{
		int sum=0;
		int digit=countDigits(number);
		while(number>0)
		{
			int rem=number%10;
			sum+=findPower(rem,digit);
			number/=10;
			digit--;
		}
	}
}
*/