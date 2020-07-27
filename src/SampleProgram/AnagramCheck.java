package SampleProgram;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String ang1 = "Listen";
		String ang2 = "Silent";
		boolean ana =true;
		
		if(ang1.length()!= ang2.length()){
			ana =false;
			System.out.println("The length of the character not matched");
		}
		else{
			char a[] = ang1.toLowerCase().toCharArray();
			char b[] =ang2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
//			Arrays.equals(a, b);
			if(Arrays.equals(a, b)){
				System.out.println(String.valueOf(a).toString() + " Is anagram with " + String.valueOf(b).toString());
			}
			else{
				System.out.println(String.valueOf(a).toString() + " Is not anagram with " + String.valueOf(b).toString());
			}
		}
	}

}
