
public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(double initialBalance, double initialRate){
		super(initialBalance);	//Invoke Account constructor
		interestRate = initialRate;
	}

//	if (acct instanceof SavingsAccount) {
//		  SavingsAccount savingsAcct = (SavingsAccount) savingsAcct;
//		  savingsAcct.creditInterest();
//	}

	public void addInterestRate(){
		double interest = this.getBalance()*this.interestRate/100;
		this.deposit(interest);
	}

	public double getInterestRate(initialRate) {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
