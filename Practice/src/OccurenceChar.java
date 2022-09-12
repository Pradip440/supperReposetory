//occurence of each char 

class OccurenceOfAllChar{
	
	public void allChar() {
		
		String s="i am p r a d i p";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]== '0')
				
				continue;
			
			int count=1;
			
			for(int j=1+i;j<s.length();j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
					
					ch[j]='0';
				}
			}
				System.out.println(ch[i]+" ="+count);
		}
	}
}
public class OccurenceChar {

	public static void main(String[] args) {
		
		OccurenceOfAllChar o1=new OccurenceOfAllChar();
		o1.allChar();
}
}
