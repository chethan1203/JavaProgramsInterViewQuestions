package OopsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args){
		MethodOverloading mtd = new MethodOverloading();
		mtd.sum();
		mtd.sum(10);
		mtd.sum("Chethan");
		mtd.sum(10, 20);
		mtd.sum(20, 1000);
		mtd.sum(50, "selenium");
		main(20);
	}
	
	//main method overloading
	public static void main(int a ){
		System.out.println("main method overload");
	}
	
	public void sum(){
		System.out.println("Test method over load with out argument");
	}
	
	public void sum(int a){
		System.out.println("Test method overload with one argument");
	}
	
	public void sum(String b){
		System.out.println("Test method overload with one argument with different data typ");
	}
	
	public void sum(int a, String b){
		System.out.println("Test method overload with two argument with different data typ");
	}
	
	public int sum(int a, int b){
		System.out.println("Test method overload with two argument with different data typ and retunr");
		int c  = a+b;
		return c;
	}
	
	public long sum(int c, long d){
		System.out.println("Test method overload with two argument with different data typ and return");
		long e  = c-d;
		return e;
	}
}
