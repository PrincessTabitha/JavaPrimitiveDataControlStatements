
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PersonManagerApp!");
		
	// start by getting user input, need to get strings c, first and last name via Console to print to the console for user to use
		
		String choice = Console.getString("Enter customer or employee? (c/e):  "); 
		String first=Console.getString("First Name: ");
		String last=Console.getString("LastName: ");
		
		if (choice.equalsIgnoreCase ("c")) {
		String num=Console.getString("Customer Number:  ");
		Customer c = new Customer (first, last, num);
		System.out.println(c.toString());
		//System.out.println("Number: " + c.getCustomerNumber());	
		}
		
		
//		String choice = Console.getString("Create customer or employee? (c/e): "); //get the string that we  in Person
//		String first = Console.getString("First name: ");
//		String last = Console.getString("Last name: ");
//		if (choice.equalsIgnoreCase("c")) {
//			String num = Console.getString("Enter customer number: ");
//			Customer c = new Customer(first, last, num);
//			System.out.println(c.toString());
//			System.out.println("Number: " + c.getCustomerNumber());
//		} else {
//			String ssn = Console.getString("Enter ssn: ");
//			Employee e = new Employee(first, last, ssn);
//			System.out.println(e.toString());
//			System.out.println("SSN: " + e.getSsn());
//		}
//		
		
		//string name = console "first name: "
		//string name = console "last name: "
		// if choice == c
		//	int num = console "enter customer number: "
		//else
		// int ssn = console "enter ssn"
		
//		Employee emp = new Employee(); // you just got the new employee, then what? set their names
//
//		e.setFirstName(firstName);
		
		
		
		System.out.println("Bye!");
	}

}
