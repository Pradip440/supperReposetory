package TwoDArray;
import java.util.Scanner;
public class TransposeM
{
    public static void main(String args[])  
    {
	
	System.out.println("Enter total rows and columns: ");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int column = sc.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
 	for(int i = 0; i < row; i++)
  	{
   	    for(int j = 0; j < column; j++) 
     	    {
        	array[i][j] = sc.nextInt();
        	System.out.print(" ");
            }
  	}
	System.out.println("The above matrix before Transpose is ");
  	for(int i = 0; i < row; i++)
    	{
      	    for(int j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
 	System.out.println("The above matrix after Transpose is ");
  	for(int i = 0; i < column; i++)
    	{
      	    for(int j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
  	     sc.close();
    }
}
