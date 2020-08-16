package OppsConceptPaert2;

public interface UsBank {

	int minbalance = 100;
	
	//in interface only method declaration
	//in interface no method implementation
	//in interface all methods are non static
	//in interface object creation is not allowed
	//in interface variables are static in nature or values can not be override by child classes
	//in interface we can achieve 100% abstraction or interface is abstract i nature
	//in interface no main method
	public void transferMoney();
	public void credit();
	public void debit(); 
}
