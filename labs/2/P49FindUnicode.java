package lab2;
import java.util.Scanner;

public class P49FindUnicode {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user for character input and store input in a variable
		System.out.print("Enter a character: ");
		char inputChar = (char)input.next().charAt(0);
		
		// Convert character into integer and print
		int intChar = (int)inputChar;
		System.out.println("The Unicode for the character " + inputChar + " is " + intChar);
		
		
	}

}
