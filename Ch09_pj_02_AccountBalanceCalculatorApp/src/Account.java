import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {
//Instance variable
	private double balance;
	
	//add constructor that accept the balance (source ... fields)
	public Account(double balance) {
		super();// you can take this super out bc it is calling from java lang parent which is automatic or leave it there;  
		this.balance = balance;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void setBalance(double amount) {
		balance= amount;
	}
 public String displayBalance () {
	 NumberFormat currency=NumberFormat.getCurrencyInstance()
			 return currency.format(balance);
 }
}
