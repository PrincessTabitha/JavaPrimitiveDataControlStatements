import java.util.Scanner;

public class GuessingNumberAPP {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ewelsome to the GuessingNumber App!");
		
		String choice="y"; //start your while loop
		int counter = 1;
		
		while (choice.equalsIgnoreCase("y")) {
			
			int num =Methods.getRandom();
			
			
		while(true) //loops infinitely until we tell it to break 
			{
				int guess=Console.getInt("Enter a number:" , 1, 100); // when you get guess=console.grt it prompt you to (int, Promopt, Min, Max
				Methods.checkGuess(guess, num);
			counter++; //will tell you how many trials
			
			if (guess ==num && counter >7) {
				System.out.println("Take Math classes");
			} else 
				if (guess ==num && counter >3) {
					System.out.println("Not too bad, Youhave got some potential");
				}
				else if (guess== num && counter <=3) {
					System.out.println("Great work, You are a math wizard");
				}
			
		choice =Console.getString("Try Again:? (y/n): ");
		
		System.out.println();
			}
		}
	}
}

