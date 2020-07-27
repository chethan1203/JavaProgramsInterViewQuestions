package OppsConceptPaert2;

public class HSBCBank implements UsBank, BrazilBank{ //multiple inheritance or "is -a relationship" relation ship b/w interfaces
 
	public void credit(){
		System.out.println("HSBC- credit");
	}
	
	public void debit(){
		System.out.println("HSBC- debit");
	}
	
	public void transferMoney(){
		System.out.println("HSBC -transfer");
	}
	
	//hsbc bank method
	public void educationLoan(){
		System.out.println("HSBC-EducationLoan");
	}
	
	public void carLoan(){
		System.out.println("HSBC-carLoan");
	}
	
	//brai bank method
	public void personalLoan(){
		System.out.println("Brazil bank method");
	}
}
