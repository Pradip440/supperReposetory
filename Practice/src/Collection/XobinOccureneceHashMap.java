package Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class XobinOccureneceHashMap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     //   String input_from_question = br.readLine();
	     // Map<String,Integer> hm=new HashMap<>();
		String words[]={"i ","am" ,"bad" ,"bad"};
	       
	       int cnt=0;
	        for(int i=0;i<words.length;i++) {
	        	if(words[i]=="0")
	        		continue;
	        	cnt=1;
	        	for(int j=i+1;j<words.length;j++) {
	        	if(words[i].equals(words[j])) {
	        		cnt+=1;
	        		words[j]="0";
	        	}
	        	}
	        	System.out.println(words[i]);
	        	 System.out.println(cnt);
	        	}
	}

}
