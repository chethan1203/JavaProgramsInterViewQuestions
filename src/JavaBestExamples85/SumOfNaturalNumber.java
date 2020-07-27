package JavaBestExamples85;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int a = 100;
		int sum = 0;
		int sum1 = 0;
		for(int i = 1;i<=a;i++){
			sum = sum + i;
			System.out.println(i + " The sum 100 is " + sum);
		}
		
		int k =1;
		while(k<=a){
			sum1 =sum1 + k;
					k++;
		}
		System.out.println("The sum is " + sum1);
	}

}
