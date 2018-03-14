import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	private static final String Formatloanamount = null;

	public static void main(String[] args) {
	System.out.println("Welcome to Interest Calculator app!");
	
	Scanner sc = new Scanner(System.in);
	
	SString choice = "y";
    while (choice.equalsIgnoreCase("y")) {
        System.out.print("Enter Loan amount: ");
        //double loanAmt = sc.nextdouble();
        String loanAmtStr = sc.next();
        BigDecimal loanAmt =new BigDecimal(loanAmtStr);
        
        System.out.print("Interest Rate: ");
        double interestrate = sc.nextDouble();
        
	//Think of number format on currency
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	System.out.println("Loan Amount " + currencyFormat.Format(loanAmt) + ".");
    System.out.println("Interest Rate " + percentFormat.Format(interestRate) + "."); 
    System.out.print("continue? (y/n): ");
    choice = sc.next();
    System.out.println();
	}
sc.close();
System.out.println("Bye!");
}
