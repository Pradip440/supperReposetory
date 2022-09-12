package stringconcate;

import java.util.Scanner;

//Java program to count the number of occurrence of a word in the given string
public class OccurenceOfWord {
	public void  countOccurrences(){
		String str = "i am pradip chuadhari am ";
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a word :");
		String word = sc1.nextLine();
		String a[] = str.split(" ");  

		int count = 0;
		for (int i = 0; i < a.length; i++){
			if (word.equals(a[i])) 
				count++;
		}
		System.out.println(count);
	}
	public static void main(String args[]){
		OccurenceOfWord v=new OccurenceOfWord();
		
		v.countOccurrences();
		
	}
}
