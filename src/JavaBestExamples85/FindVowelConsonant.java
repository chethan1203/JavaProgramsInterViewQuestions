package JavaBestExamples85;

import java.util.Scanner;

public class FindVowelConsonant {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter character to check Vowel or Consonent");
		String chr[] = {"A", "E", "I", "O", "U"};
		String check = scn.next();
		boolean flag = false;
		for(int i=0;i<chr.length;i++){
			if(check.equalsIgnoreCase(chr[i])){
				System.out.println(check + " is a Vowel");
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(check + " is a consonent");
		}
	}

}
