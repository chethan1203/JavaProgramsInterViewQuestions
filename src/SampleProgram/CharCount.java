package SampleProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCount {

	public static void main(String[] args){
	String str = "big bug big bug";
	char[] chr = str.toCharArray();
	Map<Character, Integer> charcount = new HashMap<Character, Integer>();
	for(char repchr: chr){
		Integer count = charcount.get(repchr);
		if(count ==null){
			charcount.put(repchr, 1);
		}else{
			charcount.put(repchr, ++count);
		}
	}
	
	Set<Entry<Character,Integer>>charitr = charcount.entrySet();
	for(Entry<Character,Integer> repcnt: charitr){
		if(repcnt.getValue()>1){
			System.out.println(repcnt.getKey() + " is repeated " + repcnt.getValue() + " times");
		}
	}

}
}
