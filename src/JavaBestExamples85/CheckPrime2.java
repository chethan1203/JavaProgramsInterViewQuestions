package JavaBestExamples85;

public class CheckPrime2 {
	//program to check the number can be expressed as sum of 2 prime number 	
	// 34 = 3+31, 7+ 27, 11+23 17+ 17
	public static void main(String[] args) {
		int num = 34;
		boolean flag = false;
		for(int i = 2;i<=num/2;i++){
			if(primecheck(i)){
				if(primecheck(num-i)){
					System.out.println(num + "=" + i + " + " + (num-i));
					flag =true;
				}
			}
		}
		if(!flag){
			System.out.println(num + " can not be expressed as sum of 2 prime number");
		}
	}
	public static boolean primecheck(int number){
		boolean flag = true;
		for(int i = 2; i<=number/2;i++){
			if(number % i == 0){
				flag = false;
				break;
			}
		}
		return flag;	
		}
}
