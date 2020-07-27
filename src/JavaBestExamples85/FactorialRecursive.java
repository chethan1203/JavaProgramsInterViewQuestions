package JavaBestExamples85;

public class FactorialRecursive {

	public static void main(String[] args) {
		System.out.println(factrecur(5));

	}
	public static int factrecur(int num){
		if(num >=1){
			return num * factrecur(num-1);
		}else{
			return 1;
		}
	}
}
