package lab2;
import java.util.Scanner;

public class P420ProcessString {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user for string input
		System.out.print("Enter a string: ");
		String stringInput = input.nextLine();
		
		// Output string length
		System.out.println("'" + stringInput + "' is " + stringInput.length() + " characters long");
		
		// Output first character
		System.out.println("The first character of '" + stringInput + "' is " + stringInput.substring(0,1));
		


	}

}
