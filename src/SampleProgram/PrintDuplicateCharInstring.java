package SampleProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateCharInstring {

	public static void main(String[] args) {
		
		String str = "indiancricketteam";
		char[] chr = str.toCharArray();
		
		//using hash map transfer each character to hashmap
		Map<Character, Integer> movchar = new HashMap<Character, Integer>();
		for(char ch: chr){
			Integer count = movchar.get(ch);
			if(count == null){
				movchar.put(ch, 1);
			}else{
				movchar.put(ch, ++count);
			}
		}
		
		Set<Entry<Character, Integer>> itr = movchar.entrySet();
		for(Entry<Character,Integer> val : itr){
			if(val.getValue()>1){
				System.out.println("'"+val.getKey()+ "'" + " is repeated " + val.getValue() + " times");
			}
		}
	}
}
