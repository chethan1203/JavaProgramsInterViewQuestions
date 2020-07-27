package JavaBestExamples85;

public class Swapnumbers {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int tmp;
		 
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("After reverse usign temp variable a = " +a + " and b = " + b);
		
		int x = 20;
		int y = 30;
		x=x+y; //a=20+30
		y=x-y; //b=50-30 =20
		x=x-y; //50-20 = 30
		System.out.println("After reverse usign with out temp variable sum x = " +x + " and x = " + y);	
		System.out.println(x =x*y);
		System.out.println(y=x/y);
		System.out.println(x =x/y);			
	}

}
