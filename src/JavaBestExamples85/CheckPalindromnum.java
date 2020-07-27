package JavaBestExamples85;

public class CheckPalindromnum {

	public static void main(String[] args) {
		int palin = 1233217;
		int actual = palin;
		int rev =0;
		while(palin !=0){
			rev = rev *10 + palin % 10;
			palin = palin/10;
			
		}
		System.out.println(rev);
		if(rev == actual){
			System.out.println("Is a Palindrome");
		}else{
			System.out.println("Is a not Palindrome");
		}
			
	}

}
