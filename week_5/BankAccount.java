package PRK_5;

public class BankAccount {

	private int accountNr;
	private double amount;

	BankAccount(int accountNr, double amount){
		this.accountNr = accountNr;
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void deposit(double amount) {
		this.amount += amount;
	}
	
	public void withdraw(double amount) {
		this.amount -= amount;
	}
	
	public String toString() {
		return "account number: " + this.accountNr + "\tbalance: " + this.amount;
	}

}
