package JavaBestExamples85;

public class PrimeInterval {

	public static void main(String[] args) {
		int prstart = 20;
		int prstop =50;
		while(prstart < prstop){
			boolean flag = false;
			for(int i =2;i<prstart/2;i++){
				if(prstart % i ==0){
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println(prstart + " is a prime number");
			}
			prstart++;
	}
	}
}
