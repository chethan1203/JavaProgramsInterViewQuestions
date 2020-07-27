package JavaBestExamples85;

public class DecimeltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long out = decbin(10);
		System.out.println(out);
	}
	
	public static long decbin(int num){
		long binarynum = 1,i =1;
		int reminder = 0;
		while(num!=0){
			reminder = num % 2;
			num = num/2;
			binarynum = binarynum + (reminder * i);
			i*=10;
		}
		return binarynum;
	}
	
}
