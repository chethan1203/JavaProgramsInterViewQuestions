package OopsConceptPart1;

public class Car {
   //class variables/global variables
	int model;
	int wheel;
	public static void main(String[] args) {
		//Class is entity which contains properties in the form of variables and methods, methods and variables are characteristics
		//of class
		//creating object, object is nothing but properties of the class or instance of a class have states and behaviors
		//Ex: Dog is a animal class which has state of waging tale, barking eating
		Car a = new Car();
		//a is a variable reference of an object = new car() is a object
		//new keyword is used to create object
		//we can create any number of object in a class
		Car b = new Car();
		Car c = new Car();
		a.model = 2018;
		a.wheel = 4;
		b.model = 2019;
		b.wheel = 4;
		c.model = 2020;
	    c.wheel = 4;
	    System.out.println(a.model);
	    System.out.println(a.wheel);
	    System.out.println(b.model);
	    System.out.println(b.wheel);
	    System.out.println(c.model);
	    System.out.println(c.wheel);
	    
	   //Shift object reference
	    a=b;
	    b=c;
	    c=a;
	    //a is referring b, b is referring c and c is referring a, so ultimately b is referred by c and a
	    a.model =50;
	    System.out.println("before object reference change a: " + a.model);
	    c.model =100;
	    System.out.println("after object reference change a: " + a.model);
	}

}
