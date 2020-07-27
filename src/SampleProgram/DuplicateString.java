package SampleProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String str[] = {"java", "python", "ruby", "ketlon", "java"};
		String rep = "";
		
		for(int i = 0;i<str.length;i++){
			for(int j= 0;j<i;j++){
				if(str[i]==str[j]){
					rep = str[j];
				}
			}
		}
		System.out.println(rep + " is repeated element");
		
		Set<String> st = new HashSet<String>();
		for(String name : str){
			if(st.add(name)== false){
				System.out.println("The duplicate element is : " + name);
			}
		}
		
		//Using hash map
		Map<String, Integer> StoreMap =new HashMap<String, Integer>();
		for(String name : str){
			Integer count = StoreMap.get(name);
			if(count == null){
				StoreMap.put(name, 1);
			}
			else{
				StoreMap.put(name, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entryset = StoreMap.entrySet();
		for(Entry<String, Integer> name : entryset){
			if(name.getValue()>1){
				System.out.println("The duplicate element map is : " + name.getKey());
			}
		}
	}

}
