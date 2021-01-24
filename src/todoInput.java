import java.util.Scanner;

public class todoInput {

	private Scanner input = new Scanner(System.in);
	private int switchCase;
	private int inputInt;
	private String inputString;
	private boolean isValid = false;
/**
 * userInputCase is the method for user Input when using the switch case
 * it contains a verification if the input is an int and as well as verifies if the input is between 1-4
 * @return
 */
	public int userInputCase() {
		
		while (isValid == false) {
			if (input.hasNextInt()) {
				switchCase = input.nextInt();
				if (switchCase >= 5 || switchCase <= 0) {
					System.out.println("Incorrect input try again.");
				} else {
					isValid = true;
				}
			} else {
				System.out.println("Incorrect input try again.");
				input.nextLine();
			}
		}
		isValid = false;
		return switchCase;
	}
/**
 * userInputString skips the scanner to the next line in case of bugs and allows user for any input
 * @return
 */
	public String userInputString() {
		input.nextLine();
		inputString = input.nextLine();
		return inputString;
	}
/**
 * userInputInt is used to retrieve userinput for int values however; this is without the 1-4 switchCase validation.
 * @return
 */
	public int userInputInt() {
		while (isValid == false) {
			if (input.hasNextInt()) {
				inputInt = input.nextInt();
				isValid = true;
			} else {
				System.out.println("Incorrect input try again.");
				input.nextLine();
				input.nextLine();
			}
		}
		isValid = false;
		return inputInt;
	}
}
