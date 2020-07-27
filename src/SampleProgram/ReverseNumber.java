package SampleProgram;

public class ReverseNumber {

	public static void main(String[] args) {
	//using reminder logic	
		int num = 12345;
		int rev =0;
		while(num!=0){
			//reminder 5,4,3,2,1 
			rev = rev * 10 + num%10;
			//loop 4321,321,21,1,0
			num = num/10;
		}
		System.out.println("The rev number is :" + rev);
		//Using inbuilt function StringBuffer
		int num1 = 123456;
		System.out.println("The reverse of number id : " + new StringBuffer(String.valueOf(num1)).reverse());
	}
}
