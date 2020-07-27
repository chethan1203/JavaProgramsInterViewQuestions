package SampleProgram;

public class CommonTest1 {

	public static void main(String[] args) {
	int prm = 3;
	boolean flag = false;
	for(int i =2;i<=prm/2;i++){
		if(prm % i == 0){
			flag = true;
			break;
		}
	}
	if(!flag){
		System.out.println(prm + ": is not prime number");
	}else{
		System.out.println(prm + ": is a prime number");
	}
}
}
