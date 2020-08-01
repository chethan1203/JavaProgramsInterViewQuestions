package SampleProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintMaxCharRepeat {

	public static void main(String[] args) {
		String str = "indiancricketteam";
		char[] chr = str.toCharArray();
		int temp = 0;
		Map<Character, Integer> charcnt = new HashMap<Character, Integer>();
		for (char ch : chr) {
			Integer count = charcnt.get(ch);
			if (count == null) {
				charcnt.put(ch, 1);
			} else {
				charcnt.put(ch, ++count);
				if(count>temp){
					temp = count;
				}
			}
		}
		
		Set<Entry<Character, Integer>> itr = charcnt.entrySet();
		for(Entry<Character, Integer> values : itr){
			if(values.getValue()>temp-1){
				System.out.println(values.getKey() + " is highest repeated " + values.getValue() + " times");
				
			}
		}
	}
}
