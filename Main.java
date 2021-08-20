package QSN1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount obj1=new SavingAccount();
		CurrentAccount obj2=new CurrentAccount();
		
		obj1.CheckBankBalance();
		obj1.ValidateUser();
		
		obj2.CheckBankBalance();
		obj2.ValidateUser();
		

	}

}
