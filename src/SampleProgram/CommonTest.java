package SampleProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonTest {
	public static void main(String args[]){
		
	//********Primenumber**********
		int a = 29;
		boolean flag = false;
		for(int i = 2;i<=a/2;i++){
			if(a%i==0){
				flag = true;
				break;
			}
			}
		if(!flag){
			System.out.println(a + " is a prime number");
		}else{
			System.out.println(a + " is not a prime number");
		}
	
	String s = "Karnataka";
	String rev = "";
	int str = s.length();
	
	for(int i= str-1;i>=0;i--){
		rev = rev + s.charAt(i);
	}
	System.out.println("The reverse string is: " + rev);
	
	StringBuffer str1 = new StringBuffer(s);
	System.out.println("The reverse string using string buffer is : " + str1.reverse());
	
	//**********remove junk char*********
	String junk = "dkhdf%%%%&&&8889990ABV";
	String junk1 = junk.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(junk1);
	
	//********reverse number**********
	int num = 12345;
	int rev1 = 0;
	while(num!=0){
		rev1 = rev1 * 10 + num % 10;
		num = num/10;
	}
	System.out.println("The reverese integer is : " + rev1);
	
	long num1 = 12345;
	StringBuffer numrev = new StringBuffer(String.valueOf(num1));
	System.out.println(numrev.reverse().toString());
	
	//**********duplicate string*********
	String[] dup = {"java", "selenium", "python","c","ruby", "java", "C++","c"};
	for(int i=0; i<dup.length;i++){
		for(int j=i+1; j<dup.length;j++){
			if(dup[i].equals(dup[j])){
				System.out.println("The Duplicate String is: " + dup[i]);
			}
		}
	}
	System.out.println("***********************");
	
 //**********using collection HashSet**********
	Set<String> store = new HashSet<String>();
	for(String name : dup){
		if(store.add(name)== false){
			System.out.println("The Duplicate string is ::" + name);
		}
	}
	System.out.println("***********************");
	
	//**********using collection Hashmap**********
	Map<String, Integer> storeMap = new HashMap<String, Integer>();
	for(String name: dup){
		Integer count = storeMap.get(name);
		if(count == null){
			storeMap.put(name, 1);
		}else{
			storeMap.put(name, ++count);
		}
	}
	
	//***********get the values from hashMap ierating entry set*********
	Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet ){
			if(entry.getValue()>1){
				System.out.println("The Duplicate String is : " + entry.getKey());
			}
		}
	}	
}