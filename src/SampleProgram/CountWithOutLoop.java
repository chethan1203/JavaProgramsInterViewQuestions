package SampleProgram;

public class CountWithOutLoop {

	public static void main(String[] args) {
		int number =1;
		PrintNum(number);
		}
	
	public static void PrintNum(int num){
		
		if(num <=100){
			System.out.println(num + "");
			PrintNum(num +1);
		}
	}
	}

