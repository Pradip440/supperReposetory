package stringconcate;

//Assignment 9) :- 5) Write a Java program to count occurrences of a word in a given string.
import java.util.Scanner;

public class OccurenceOfWordPerfect {

	public void showOccurenceofword() {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
			
		String strArray[] = str.split(" ");
			
		for(int i=0;i<strArray.length;i++) {
			
			int count=0;
			for(int j=0;j<strArray.length;j++) {
					
			String temp1 = strArray[i];
			String temp2 = strArray[j];

			if(j<i && temp1.equals(temp2)) {
				break;
			}
			if(temp1.equals(temp2)) {
				count++;				
		    }
			if(j==strArray.length-1) {
				System.out.println(strArray[i]+" = "+count);
			}
		}
	}
		sc.close();
		
}
	void show () {

		String str=" i love love my india";
		String strArray[] = str.split(" ");
			
		for(int i=0;i<strArray.length;i++) {
			
			
			for(int j=0;j<strArray.length;j++) {
				int count=0;
			if(strArray[j]==strArray[i]) {
				count ++;
				
			}
			System.out.println(strArray[i] +" "+count);
	}
		}
		//sc.close();
	}
	public static void main(String[] args) {
		
		OccurenceOfWordPerfect o1=new OccurenceOfWordPerfect();
		//o1.showOccurenceofword();
		o1.show();
	}

}