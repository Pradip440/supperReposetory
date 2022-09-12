import java.util.Scanner;

public class StringPalindrom {

    static boolean sentencePalindrome(String str) 
    {     
        int j = 0; 
        int i = str.length()-1; 
         
        str = str.toLowerCase();
        while(j <= i) 
        {     
            char c1 = str.charAt(j); 
            char c2 = str.charAt(i); 
               
            if (!(c2 >= 'a' && c2 <= 'z')) 
                j++; 
            else if(!(c1 >= 'a' && c1 <= 'z')) 
                i--; 
            else if( c2 == c1) 
            { 
                j++; 
                i--; 
            } 
            else
                return false; 
        } 
        return true;     
} 
       
    public static void main(String[] args)  
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a string : ");
    	String str=sc.nextLine();
      // String str = "abaa"; 
        if( sentencePalindrome(str)) 
        	
          System.out.println("true"); 
        else
          System.out.println("false"); 
    } 
}