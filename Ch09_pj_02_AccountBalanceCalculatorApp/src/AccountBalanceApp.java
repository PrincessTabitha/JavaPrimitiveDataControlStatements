
public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance App");
		
		CheckingAccount ca = new CheckingAccount(1000, 1, 0);
		SavingsAccount sa = new SavingsAccount (1000, .01);
		System.out.println("Starting Balance");
		
		displayBalances (ca, sa);
		
		System.out.println( "Enter the transaction for the month");
		String action = Console.getString("Withdraw or Depoit", "w", "d");
		String account =Console.getString("Account? (c/s):  ", "C", "s" );
		double amount = Console.getDouble("Amount?  ", 0, 1000);
		
		//set account
	Account a;
		if (account.equalsIgnoreCase ("c")) {
			a = ca;
		} else {
			a=sa;
		}
		if (account.equalsIgnoreCase ("w")) {
			a.withdraw(amount);
		} else {
			a.deposit(amount);
		}
		choice = Console.getString(("Continue? (y/n) ", "y", "n")
		
System.out.println ("bye");
	}

	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		// TODO Auto-generated method stub
		
	}

}
