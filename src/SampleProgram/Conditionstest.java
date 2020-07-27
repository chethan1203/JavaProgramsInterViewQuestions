package SampleProgram;

public class Conditionstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b= 30;
		int c= 40;
		
		if(a> b & a> c){
			System.out.println(a + " : is greatest that is a");
		}else if(b > c){
			System.out.println(b + ": is greatest that is b");
		}
		else{
			System.out.println(c + ": is greatest that is c");
		}
	}

}
