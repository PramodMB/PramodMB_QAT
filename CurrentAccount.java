package QSN1;

public class CurrentAccount implements BankAccount {
	
	@Override
	public void CheckBankBalance() {
		System.out.println("Current account Bank Balance");
	}
	
	@Override
	public void ValidateUser() {
		System.out.println("Current account holder Validation");
	}

}
