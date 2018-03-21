
public class OddOrEvenCheckerApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Odd or Even Checker App");
			
		MyConsole console = new MyConsole();
		
	String	choice ="y";
	while (choice.equalsIgnoreCase("y")){
		//user input
		int num=console.getInt("Enter an integer:   ");
		
		//biz logic
		String OddOrEven =" ";
		if (num%2==0) {
			OddOrEven="Even";
		}
		else {
			OddOrEven="Odd";
		}
		//printout	
		System.out.println ("The number: " + num +  " " + "is " + OddOrEven + "\n");
	
		choice=console.getString("Continue? y/n:    ");
		System.out.println("Bye!");
		}	
	}
}
