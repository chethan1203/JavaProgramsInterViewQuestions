package JavaBestExamples85;

public class ArmstorngNumber {

	public static void main(String[] args) {
		int arm =153;
		int actnum = arm;
		double result=0;
		while(arm!=0){
			int arm1 =arm%10;
			result = result + Math.pow(arm1, 3);
			arm =arm/10;
		}
		
		if(actnum ==result){
			System.out.println(result + " is a Armstorng number");
		}else{
			System.out.println(result + " is a not Armstorng number");
		}
			
	}

}
