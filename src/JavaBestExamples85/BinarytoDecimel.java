package JavaBestExamples85;

public class BinarytoDecimel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 10011011;
		System.out.println(bintodeci(number));
	}
	
	public static double bintodeci(long binary){
		long reminder;
		int i = 0;
		double decimalnum = 0;
		while(binary !=0){
			reminder = binary %10;
			System.out.println(reminder);
			binary = binary / 10;
			System.out.println(binary);
			decimalnum = decimalnum + (reminder * Math.pow(2, i));
			System.out.println(decimalnum);
			++i;		
		}
		return decimalnum;
	}
}
