package JavaBestExamples85;

public class Primenumcheck {

	public static void main(String[] args) {
		int p = 17;
		boolean flag =false;
		
		//i should be start from 2 since all number divisible by 1
		for(int i = 2; i<=p/2;i++){
			if(p%i == 0){
				flag =true;
				break;
			}
		}
			if(!flag){
				System.out.println(p + " : is a prime number");
			}else
			{
				System.out.println(p + " : is a not prime number");
			}
	}

}
