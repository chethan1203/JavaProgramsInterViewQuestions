package OppsConceptPaert2;

public class BMW extends Car{ //has-a relationship or inheritance, relation ship b/w classes
	
	//this is called method overriding, when same method present in parent and child class with same name and same argument
	public void start(){
		System.out.println("BMW start");
	}
	public void theftsafty(){
		System.out.println("BMW--Theft safty");
	}
}
