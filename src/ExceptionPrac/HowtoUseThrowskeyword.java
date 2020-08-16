package ExceptionPrac;

public class HowtoUseThrowskeyword {

//	public static void main(String[] args) throws ArithmeticException{
//		HowtoUseThrowskeyword thrw = new HowtoUseThrowskeyword();
//		thrw.sum();
//		// Throws is also used to handle the exception
//		//Throws keyword used in method chaining
//	}
//	public void sum()throws ArithmeticException{
//		div();
//	}
//	public void div()throws ArithmeticException{
//		int i=9/0;
//	}
	//we can use by declaring the try cathch in calling method to avoid the terminating the program
//	public static void main(String[] args){
//		HowtoUseThrowskeyword thrw = new HowtoUseThrowskeyword();
//		thrw.sum();
//		System.out.println("Test");
//		// Throws is also used to handle the exception
//		//Throws keyword used in method chaining
//	}
//	public void sum(){
//		try{
//		div();
//		}catch(ArithmeticException e){
//			
//		}
//	}
//	public void div()throws ArithmeticException{
//		int i=9/0;
//	}
	
	//we can use by declaring the try cathch in calling method to avoid the terminating the program
		public static void main(String[] args){
			HowtoUseThrowskeyword thrw = new HowtoUseThrowskeyword();
			thrw.sum();
			System.out.println("Test");
			// Throws is also used to handle the exception
			//Throws keyword used in method chaining
		}
		public void sum(){
			try{
			div();
			//instead of Arithmetic exeception we can use Exception class Arithmetic and other exceptions extends Exception 
			//class
			}catch(Exception e){
				
			}
		}
		public void div(){
			int i=9/0;
		}


}
