import java.util.Arrays;
// remove duplicate from array
public class VowelsCnt {
	public void show() {
		int arr[]= {11,12,13,14,16,11,12,1,1};
		for(int i=0;i<arr.length;i++) {
			int cnt=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	public void show2() {
		 String str = new String("Hi Welcome to Tutorialspoint");
	      int cnt=0;
	      for(int i=0; i<str.length(); i++) {
	    	  char ch=str.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
	        	 cnt++;
	        	  //System.out.println("Given string contains "+ch+  " at index "+i);	 
	         }
	      }
	      System.out.println(cnt);
	}

	   public static void main(String args[]) {
		   VowelsCnt v=new VowelsCnt();
		   v.show2();
	     
	   }
	}