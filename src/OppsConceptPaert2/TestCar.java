package OppsConceptPaert2;

public class TestCar {

	public static void main(String[] args) {
		BMW car = new BMW();
		
		//this is called static or compile time polymorphism
		car.start();
		car.stop();
		car.refule();
		car.theftsafty();
		car.engine();
		
		//this is also called top casting
		Car c1 = new BMW(); //child class object can be referred by parent class variable is called dynamic polymorphism or runtime polymorphi
		c1.start();
		c1.stop();
	    c1.refule();
	    c1.engine();
	}
		
}