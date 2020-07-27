package SampleProgram;

public class FibonacciCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		int b=1;
		int n =10;
		for(int i = 1;i<n;i++){
			System.out.println(a + "+");
			int sum = a+b;
			a = b;
			b= sum;
		}

	}

}
