package SampleProgram;

public class SwapWithOutTemp {

	public static void main(String[] args) {
		int x= 5;
		int y= 10;
		
		x = x+y; //15
		y = x-y; //5
		x = x-y ; //10
		
		x = x*y; //50
		y = x/y; //50/10 = 5
		x = x/y; //50/5 = 10
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println(x);
		System.out.println(y);
	}

}
