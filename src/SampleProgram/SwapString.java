package SampleProgram;

public class SwapString {

	public static void main(String[] args) {
		String str = "Good";
		String str1 = "Morning";
		System.out.println("Before swap str " + str + " Before swap str1  "  + str1);
		str = str+str1; //Goodmornig
		str1 = str.substring(0, str.length()-str1.length());
		str = str.substring(str1.length());
		System.out.println("After swap str " + str + " After swap str1  "  + str1);	
	}
}
