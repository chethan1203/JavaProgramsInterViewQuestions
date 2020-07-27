package OppsConceptPaert2;

public class ConstructorConcept {
	
	//constructor is like a function and does not return any value
	//constructor name is same as class name
	//when we want to initalize global variable
	//constructor is with 0 parameter is called Default constructor
	//constructor can be overloaded
	
	int age;
	String name;
	
	public ConstructorConcept(){
		System.out.println("Deafult constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("overloaded constructor with 1 paramter");
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("overloaded constructor with 2 paramter");
	}
	
	//this keyword is used initialize the global variable with local variable
	public ConstructorConcept(int age, String name){
		this.age =age;
		this.name = name;
		System.out.println(age);
		System.out.println(name);
		
		System.out.println("overloaded constructor with 2 paramter");
	}

	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept();
		ConstructorConcept cc1 = new ConstructorConcept(10);
		ConstructorConcept cc2 = new ConstructorConcept(10, 20);
		ConstructorConcept cc3 = new ConstructorConcept(10, "Selenium");
		ConstructorConcept cc4 = new ConstructorConcept(15, "REST");
		ConstructorConcept cc5 = new ConstructorConcept(20, "NODE");
		System.out.println(cc.age);
		System.out.println(cc.name);
		System.out.println("******************");
		System.out.println(cc1.age);
		System.out.println(cc1.name);
		System.out.println("******************");
		System.out.println(cc2.age);
		System.out.println(cc2.name);
		System.out.println("******************");
		System.out.println(cc3.age);
		System.out.println(cc3.name);
		System.out.println("******************");
		System.out.println(cc4.age);
		System.out.println(cc4.name);
		System.out.println("******************");
		System.out.println(cc5.age);
		System.out.println(cc5.name);
		System.out.println("******************");
	}
}
