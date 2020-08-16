package ExceptionPrac;

public class Exception1 {

	public static void main(String[] args) {
		try{
			//uncaught exception
			int i = 9/0; //this code will give exception and catch in catch block
			System.out.println(i);
			
			//caught exception
//			Thread.sleep(1000);
		}catch(ArithmeticException e){
			e.printStackTrace();	
			System.out.println(e.getMessage());
		}
		System.out.println("TEst");
	}

}
