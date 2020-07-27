package OopsConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		//we need to create class object to call the non static functions/methods
		FunctionInJava fnc = new FunctionInJava();
		fnc.noinputnooutputpnoreturn();
		int a = fnc.onlyreturn();
		String b = fnc.onlyreturnString();
		int c = fnc.withArguments(40, 2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		math(20, 30);
	}
	
	//no input, no return, no output
	public void noinputnooutputpnoreturn(){
		System.out.println("noinputnooutputpnoreturn");
	}
	
	//returning output from this function
	public int onlyreturn(){
		int a =10;
		int b = 20;
		int c = a + b;
		return c;
	}
	
   public String onlyreturnString(){
	   System.out.println("This is string return");
	   String s = "Selenium";
	   return s;
   }
  
   //function with argument input and return the output
   public int withArguments(int a, int b){
	   int c = a/b;
	   return c;
   }
   
   //with static method access with out referring the class object
   public static int math(int a, int b){
	   int area = a*b;
	   System.out.println("The triangle is : " + area);
	   return area;
	   
   }
}
