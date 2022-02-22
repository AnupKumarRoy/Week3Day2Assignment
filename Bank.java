package Week3Day2;

public class Bank extends SBI implements CIBIL,PNB{


	

	@Override
	public void creditScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("Miinumum Balance");
	}

	@Override
	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("CIBIL Score");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("Bank Balance");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Loan Amount");
	}
public static void main(String[] args) {
	Bank bank = new Bank();
	bank.cibilScore();
	bank.minimumBalance();
	bank.maximumLoanAmount();
	bank.ITLoan();
	bank.bankBalance();
}}

