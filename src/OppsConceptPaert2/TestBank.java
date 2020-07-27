package OppsConceptPaert2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank bnk = new HSBCBank();
		bnk.credit();
		bnk.debit();
		bnk.transferMoney();
		bnk.personalLoan();
		
		System.out.println("**********************8");
		//hsbc bank methods
		bnk.educationLoan();
		bnk.carLoan();
		
		UsBank nk = new HSBCBank();
		nk.credit();
		nk.debit();
		nk.transferMoney();
		
	}

}
