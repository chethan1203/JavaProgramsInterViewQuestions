package JavaBestExamples85;

public class PrintTheCountInteger {

	public static void main(String[] args) {
		int count = 0;
		int intcount = 1234567890;
		while(intcount != 0){
			intcount = intcount/10;
			++count;
		}
		System.out.println("The number of digit count is: " + count);
	}

}
