package Constructor;

public class BankAccount {
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		return (balance+amount);
	}
	
	public double withdraw(double amount) {
		return (balance+amount);
	}

	public static void main(String[] args) {
		

	}

}
