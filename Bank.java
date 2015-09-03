import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//Create an array to store the bank accounts.
		BankAccount[] accounts = new BankAccount[1];
		//numAccounts is the number of accounts currently in
		//existence. current is the array index of the currently
		//selected account (or -1) if no account is currently
		//selected).
		int numAccounts = 0;
		int current = -1;
		
		//Read and execute commands
		while(true){
		
		System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
		System.out.println("|Commands: o - Open Account    c - Close account|");
		System.out.println("|          d - Deposit         w - Withdraw     |");
		System.out.println("|          s - Select account  r - Write check  |");
		System.out.println("|          i - Credit interest q - Quit         |");
		System.out.println("-------------------------------------------------");
		
		//Display list of commands
		System.out.print("Current account: ");
		if(current != -1){
			System.out.print(accounts[current].getNumber() + " Balance: $");
			
			//Round the balance to the nearest cent
			long balanceInCents = Math.round(accounts[current].getBalance() *100);
			
			//Display the balance as dollars and cents, adding
			//a leading zero if the cents is a one-digit number
			System.out.print(balanceInCents / 100 + ".");
			long cents = balanceInCents %100;
			if (cents < 10)
				System.out.print("0");
			System.out.println(cents);
		}	
		
		else
			System.out.println("None selected");
			System.out.println("The total number of accounts in the bank are: " + numAccounts);
			System.out.println();
			
		//Prompt the user to enter a command
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter command: ");
		String command = input.next().trim();
		
		//Use a cascaded if statement to determine which
		//command was entered.
		if(command.equalsIgnoreCase("o")){
			
			//*** Open command ***
			//If the accounts array is full, double its size
			if(numAccounts == accounts.length){
				BankAccount[] tempArray = new BankAccount[accounts.length*2];
			for(int i = 0; i < accounts.length; i++)
				tempArray[i] = accounts[i];
			accounts = tempArray;
			}
			
		//Prompt the user for the account number and balance.
		System.out.print("Enter new account number: ");
		String accountNumber = input.next().trim();
		System.out.print("Enter initial balance: ");
		double balance = input.nextDouble();		
		System.out.println("Will this be a checking account or a savings account?");
		System.out.println("Enter c (checking) or s (savings): ");
		String accountType = input.next().trim();
//			if(accountType.equalsIgnoreCase("c"));
//				CheckingAccount checkingAcct = (CheckingAccount) acct;
//				return accountType(CheckingAccount);
//			}
//			else if(accountType.equalsIgnoreCase("s")){
//				SavingsAccount savingsAcct = (SavingsAccount) acct;
//				return accountType(SavingsAccount);
//			}
//			else
//				//*** Illegal command ***
//				System.out.println("Input was not c or s; " + "please try again.");
			
		
		//Prompt the user for the account type.
		
		
		//Create a new BankAccount object and store it in the
		//accounts array.
		accounts[numAccounts] = new BankAccount(accountNumber, balance);
		current = numAccounts;
		numAccounts++;
		}
		else if(command.equalsIgnoreCase("c")){
			//*** Close command **
			if(current != -1){
				if(current == numAccounts-1) //If current is the last object in the array, delete current one;
					accounts[--numAccounts-1] = null;
				else accounts[current] = accounts[--numAccounts]; //else move the last object to current location, delte current one.
				current = -1; 
				
				System.out.println("The current account is closed.");
			}
			else
				System.out.println("Please select an account");
		}
		else if (command.equalsIgnoreCase("d")){
			// *** Deposit command ***
			if(current != -1){
				System.out.print("Enter amount to deposit: ");
				double amount = input.nextDouble();
				accounts[current].deposit(amount);
			}else
				System.out.println("Please select an account");
		}
		else if(command.equalsIgnoreCase("w")){
			// *** Withdraw command ***
			if(current != -1){
				System.out.print("Enter amount to withdraw: ");
				double amount = input.nextDouble();accounts[current].withdraw(amount);
			}
			else
				System.out.println("Please select an account");
		}
		else if(command.equalsIgnoreCase("s")){
			// *** Select command ***
			System.out.print("Enter account number: ");
			String accountNumber = input.next().trim();
			int i;
			for(i = 0; i < numAccounts; i++)
				if(accountNumber.equals(accounts[i].getNumber())){
					current = i;
					break;
//				if(i == numAccounts);
//				System.out.println("Account number was not found");
		}
//		else if(command.equalsIgnoreCase("i")){
//			if(accountType.equals(accountType[1]));
			//	System.out.print("You have a savings account.");
			//	System.out.print("You earn 6 percent annual interest.");
			//	System.out.print("It looks like it's already that time!");
//					input.next().trim();
					
		}
			
		else if(command.equalsIgnoreCase("q")){
			// *** Quit command ***
			return;
		}
//		else if(command.equalsIgnoreCase("r")){
//			System.out.print("Whom is the party recieving?");
//			String partyto = input.next().trim();
//			System.out.print("How much will you be sending?");
//			double amount = input.nextDouble();
//			System.out.println("Your new account balance is");accounts[current].withdraw(amount);
//			System.out.println("Thank you!");
//		}
		
		else{
			// *** Illegal command ***
			System.out.println("Command was not recognized; " + "please try again.");
			}
			System.out.println();
			}
		}
	}
		


