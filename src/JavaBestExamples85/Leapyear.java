package JavaBestExamples85;

public class Leapyear {

	public static void main(String[] args) {
		
		//divisible by 4 for all the century years --end with 00
		//century is a leap year if it is divisible by 400
		//1900 is not a leap year
		//2012 is a leap year 
		
		int year =2000;
		boolean flag = false;
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					flag = true;
				}else{
					flag = false;
				}
			}else{
				flag = true;
			}
		}else{
			flag = false;
		}
		
		if(flag){
			System.out.println(year + " is a leap year");
		}else{
			System.out.println(year + " is not a leap year");
		}

	}

}
