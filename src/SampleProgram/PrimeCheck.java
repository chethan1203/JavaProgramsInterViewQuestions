package SampleProgram;

public class PrimeCheck {

	public static void main(String[] args) {
		int p =4;
		boolean flag = false;
		for(int i = 2;i<= p/2; ++i){
			if(p % i == 0){
				flag =true;
				break;
			}
		}
		if(!flag)
			System.out.println(p + "is a prime number");
		else{
			System.out.println(p + " is not a prime number");
	} 
	}
}
