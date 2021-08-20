package QSN1;

public class SavingAccount implements BankAccount {
	
	@Override
	public void CheckBankBalance() {
		System.out.println("Savings account Bank Balance");
	}
	
	@Override
	public void ValidateUser() {
		System.out.println("Savings account holder Validation");
	}

}
