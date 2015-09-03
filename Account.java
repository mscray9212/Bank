
public abstract class Account {
	int accountNum;
	double accountBal;
	public abstract int getNum();
	public abstract double getBal();
	public abstract void getInfo();
	public Account(int acctNum){
		accountNum = acctNum;
		accountBal = 0.0;
	}
	
	public void setBal(double bal){
		accountBal = bal;
	}
	
	
	public class CheckingAccount extends Account{
		public CheckingAccount(int i){
			super(i);
		}
		
		public int getNum(){
			return accountNum;
		}
		public double getBal(){
			return accountBal;
		}
		
		public void getInfo(){
			System.out.println(getNum() + getBal());
		}
	}
	
	public class SavingsAccount extends Account{
		double initialRate;
		
		public SavingsAccount(int a, double r){
			super(a);
			initialRate = r;
		}
		
		public int getNum(){
			return accountNum;
		}
		
		public double getBal(){
			return accountBal;
		}
		
		public void getInfo(){
			System.out.println(getNum() + getBal());
		}
	}
}
//	public Savings(double initialBalance, double initialRate) {
//		double balance;
//		double interestRate;
//		balance = initialBalance;
//		interestRate = initialRate;
//	}
//		private double interestRate;
//		
//		public double getInterestRate(){
//			return interestRate;
//		}
//		public void setInterestRate(double rate){
//		interestRate = rate;
//		}
//		public double creditInterest(double i){
//			double creditInterest = i;
//			return i;
//	}
//		SavingsAccount savingsAcct = (SavingsAccount) acct;
//		CheckingAccount checkingAcct = (CheckingAccount) acct;
		
//		if(acct instanceof SavingsAccount){
//			SavingsAccount savingsAcct = (SavingsAccount) acct;
//			savingsAcct.creditInterest();
//		}
	
//		static void updateAccount(Account acct){
			
//		}
	
//	public void Checking() {
//		int numOfChecks;
		
//	}
		
	
//}
