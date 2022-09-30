//write a java program to find common elements between two arrays
public class Assigment6
{
	  public static void main(String a[])
	  {
	      int[] arr1 = {12,25,15,67,78,91,56};
	      int[] arr2 = {39,25,15,23,55,91,66};
	      int temp=0;
	      System.out.println("Common element between two  Arrays are : ");
	      for(int i = 0;i < arr1.length; i++)
	      {
	    	  int cnt=0;
	    	  for(int j=0;j<arr2.length;j++) {
	    	  if(arr1[i]==arr2[i]) {
	    		  cnt++;
//	    		  System.out.println(arr2[i]);
	    	  	}
	    	  }
	    	  if(cnt==0) {
	    		  System.out.print(arr2[i]+" "+arr1[i]+" ");
	    	  }
	      }
	   }
}
