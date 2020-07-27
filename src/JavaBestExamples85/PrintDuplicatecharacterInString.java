package JavaBestExamples85;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicatecharacterInString {

	public static void main(String[] args) {
		String str = "indiancricketteam";
		char[] c =str.toCharArray();
		Map<Character, Integer> st = new HashMap<Character, Integer>();
		for(char ct : c){
			Integer counter = st.get(ct);
			if(counter == null){
				st.put(ct, 1);
			}else
				st.put(ct, ++counter);
		}
		
		Set<Entry<Character, Integer>> set = st.entrySet();
			for(Entry<Character, Integer> charact: set){
				if(charact.getValue()>1 && charact.getValue()>2){
					System.out.println("The duplicate char is : " + charact.getKey() + " repeated " + charact.getValue() + " times");
					}
			}
	}
}
