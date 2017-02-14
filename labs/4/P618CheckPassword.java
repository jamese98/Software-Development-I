package lab4;
import java.util.Scanner;

public class P618CheckPassword {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for password
		System.out.print("Password: ");
		String password = input.nextLine();
		
		// Check if password is valid and print result
		if (validPassword(password)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}

	}
	
	// Method to check if password is valid
	public static boolean validPassword(String password) {
		int numCount = 0; // Initialize password number counter
		boolean isValid = false;
		// Check if length is 8 or more
		if (password.length() < 8) {
			isValid = false;
		} else {
			// Check each character of password string
			for (int i = password.length() - 1; i >= 0; i--) {
				char checkChar = password.charAt(i);
				int checkCharInt = (int)checkChar;
				// Check if character is not a number or letter
				if (checkCharInt < 48 && checkCharInt > 57 && checkCharInt < 65 && checkCharInt > 90) {
					isValid =  false;
					// Count amount of numbers in password
				} if (checkCharInt >= 48 && checkCharInt <= 57) {
					 numCount++;
				} if (numCount < 2) {
					isValid = false;
				} else {
					isValid = true; // password is valid
				}
					
			}
			
		}
		return isValid; // Return result
	}
}

