package JavaBestExamples85;

public class TableMultiplication {
	
	public static void main(String[] args) {
		mul(5);
	}

	public static void mul(int mul){
		for(int i =1 ;i<=10;i++){
			System.out.println(mul + "x" + i  + " = " +(mul * i));
		}

	}
}
