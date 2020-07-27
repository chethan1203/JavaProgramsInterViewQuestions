package JavaBestExamples85;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatwordsinString {

	public static void main(String[] args) {
		findduplicate("The java is best in market as java is always top in market");
	}
	public static void findduplicate(String inputstring){
		String word[] = inputstring.split(" ");
		Map<String, Integer> wordsCount = new HashMap<String,Integer>();
		for(String words: word){
		if(wordsCount.containsKey(words)){
			wordsCount.put(words, wordsCount.get(words)+1);
		}else{
			wordsCount.put(words, 1);
		}
	}
		Set<String> getword = wordsCount.keySet();
		for(String word1 : getword){
			if(wordsCount.get(word1)>1){
				System.out.println(word1 + ": " + wordsCount.get(word1));
			}
		}
	}
}
