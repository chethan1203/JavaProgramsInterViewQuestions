package JavaBestExamples85;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a =1;
		int b=1;
		for(int i =1;i<=10;i++){
			System.out.println("The Fibnacci of " + i + " is : " + a);
			int tmp = a + b;
			a = b;
			b =tmp;
		}
	}

}
