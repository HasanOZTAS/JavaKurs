package day17_classObjects_Part2;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;	
	
	
	public void deposit(double amount) {
		System.out.println("depositing $" + amount + " to " + accountNumber);
		balance+=amount;		
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance-=amount;
		
		if (balance<0) {
			balance-=35;
		}		
	}
	
	public void showBalance() {
		System.out.println("-----------");
		System.out.println("AccountHolder: " + accountHolder);
		System.out.println("AccountNumber: " + accountNumber);
		System.out.println("Blance $ " + balance);
		System.out.println("-----------");
	}
	
	public void charge( double price, String item) {
		if (balance>=price) {
			System.out.println("Buying " + item + " for $ " + price + " from " + accountNumber);
			balance-=price;
		}else {
			System.out.println("Insufficient funds to purchase " + item + " from " + accountNumber);
		}
	}
	
	
	

}
