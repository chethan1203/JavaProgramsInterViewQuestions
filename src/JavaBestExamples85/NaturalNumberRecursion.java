package JavaBestExamples85;

public class NaturalNumberRecursion {

	public static void main(String[] args) {
		// A method calling itself is called recurrsive
		int number = 10;
		int sum = addnum(number);
		System.out.println("The sum is : " + sum);

	}

	public static int addnum(int num){
		if(num !=0){
			return num + addnum(num -1);
		}else{
			return num;
		}
	}
}
