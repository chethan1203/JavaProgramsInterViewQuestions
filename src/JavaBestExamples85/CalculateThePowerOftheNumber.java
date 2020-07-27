package JavaBestExamples85;

public class CalculateThePowerOftheNumber {

	public static void main(String[] args) {
		int pow = 40;
		int sum=2;
		long s=1;
//		for(int i = 1;i<=10;i++){
//			System.out.println("The square of 2 is : " + sum);
//			sum = sum * pow;	
//		}
		
		while(pow!=0){
			s *=sum;
			--pow;
		}
		System.out.println(s);
	}

}
