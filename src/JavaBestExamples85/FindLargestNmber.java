package JavaBestExamples85;

public class FindLargestNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3040;
		int num1 = 299910;
		int num2 = 2350;
		
		if(num > num1 && num > num2){
			System.out.println(num + " is greater than " + num1 );
		}else if (num1 > num2){
			System.out.println(num1 + " is greater than " + num2 );
		}else{
			System.out.println(num2 + " is greater number");
		}
		
		
	}

}
