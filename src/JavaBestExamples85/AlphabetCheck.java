package JavaBestExamples85;

public class AlphabetCheck {

	public static void main(String[] args) {
		char c = 'X';
		if((c >= 'a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println(c + " is a alphabit");
		}else{
			System.out.println(c + " not alphabet");
		}
	}

}
