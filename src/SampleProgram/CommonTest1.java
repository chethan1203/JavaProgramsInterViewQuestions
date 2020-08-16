package SampleProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonTest1 {

	public static void main(String[] args) {
		// prime number
		int prm = 10;
		boolean flag = false;
		for (int i = 2; i < prm / 2; i++) {
			if (prm % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(prm + " : is a prime number");
		} else {
			System.out.println(prm + " : is not a prime number");
		}
	 //reverse number
		int num = 12345;
		int rev=0;
		while(num!=0){
			rev = rev * 10 + num%10;
			num =num/10;
		}
		System.out.println(rev);
		
		//fibonacci series
		int a=1;
		int b=1;
		int fib=0;
		for(int i=1;i<10;i++){
			System.out.println(a + "+");
			fib = a+b;
			a=b;
			b= fib;
		}
		
		//reverse string
		String str = "Selenium";
		String revr= "";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--){
			revr = revr + str.charAt(i);
		}
		System.out.println(revr);
		
		//factorial
		int fact=0;
		for(int i=1;i<=5;i++){
			i*=i;
			fact=i;
		}
		System.out.println("factorial of 5 is: " + fact);
	
	//find duplicate character in string
	String strn = "indiancricketteam";
	
	char[] repchar = strn.toCharArray();
	Map<Character, Integer>repcount = new HashMap<Character, Integer>();
	for(Character chr: repchar){
		Integer count = repcount.get(chr);
		if(count == null){
			repcount.put(chr, 1);
		}else{
			repcount.put(chr, ++count);
		}
	}
	Set<Entry<Character,Integer>> itrcont = repcount.entrySet();
	for(Entry<Character, Integer> charact :itrcont){
		if(charact.getValue()>1){
			System.out.println(charact.getKey() + " : are repeated character " +charact.getValue() + " times");
		}
	}
	
	//repeated word in a string
	String repstr = "The java is best in market as java is always top in market";
	String[] repword = repstr.split(" ");
	Map<String, Integer>word = new HashMap<String,Integer>();
	for(String itrword: repword){
		if(word.containsKey(itrword)){
			word.put(itrword, word.get(itrword)+1);
		}else{
			word.put(itrword, 1);
		}
	}
	Set<String>itrset = word.keySet();
	for(String wordset: itrset){
		if(word.get(wordset)>1){
			System.out.println(wordset + ": " + word.get(wordset));
		}
	}
		
	}
}
