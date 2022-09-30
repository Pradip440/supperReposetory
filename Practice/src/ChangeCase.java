
public class ChangeCase {   
	public void show() {
		String s="Ram";
		String str=s.toLowerCase();
		System.out.println(str);
		
	}
	
    public static void main(String[] args) {    
            
        String str1="Great Power";    
      //  StringBuffer newStr=new StringBuffer(str1);    
            String newStr=str1;
        for(int i = 0; i < str1.length(); i++) {    
                char ch=str1.charAt(i);
            //Checks for lower case character    
            if(Character.isLowerCase(ch)) {    
                //Convert it into upper case using toUpperCase() function    
                //newStr.setCharAt(i, Character.toUpperCase(ch));
            	newStr.toUpperCase();
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(ch)) {    
                //Convert it into upper case using toLowerCase() function    
               // newStr.setCharAt(i, Character.toLowerCase(ch)); 
            	newStr.toLowerCase();
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}     