package stringconcate;

public class OccurenceOfChar {
	
		public static void main(String[] args) {
			String s = "my my a a b b";
		
			char search = 'm';
			int count=0;
			for (int i=0;i<s.length();i++) {
				if(s.charAt(i)==search)
					count++;
			}
			System.out.println(count);
		}
		
		
}
