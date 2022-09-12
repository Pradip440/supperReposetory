//write a java program to find common elements between two arrays
public class Assigment6
{
	  public static void main(String a[])
	  {
	      int[] arr1 = {12,25,15,67,78,91,56};
	      int[] arr2 = {39,25,15,23,55,91,66,22};
	      System.out.println("Common element between two  Arrays are : ");
	      for(int i = 0;i < arr1.length; i++)
	      {
	    	  if(arr1[i]==arr2[i]) {
	    		  System.out.println(arr2[i]);
	    	  }
	       
	      }
	   }
}
