
public class ABCpattern {

	public static void main(String[] args) {
		/*int i ,j, row=5;
		for (i =0; i<row; i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println( );
			
		}*/

		
		char ch= 'A';
		  for (int i=1; i<=5;i++)
		  {
		   for(int j=1; j<=i;j++)
		    {
		       System.out.print(ch+"");
		    }
		     System.out.println();
		     ch++;
		  }
		 
		 
	}

}
