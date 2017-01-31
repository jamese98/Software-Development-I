package lab2;
import java.util.Scanner;

public class P413VowelOrConsonant {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user for character input 
		System.out.print("Enter a letter: ");
		char inputChar = (char)input.next().charAt(0);
		
		// Check if character is not a letter
		if (!( inputChar >= 'A' && inputChar <= 'Z') && !( inputChar >= 'a' && inputChar <= 'z' )) {
			System.out.println(inputChar + " is invalid input");
			System.exit(0);
		}
		
		
		// Determine if character is vowel or consonant
		String speechSound = "";
		switch (inputChar) {
			case 'A': speechSound = "vowel";break;
			case 'E': speechSound = "vowel";break;
			case 'I': speechSound = "vowel";break;
			case 'O': speechSound = "vowel";break;
			case 'U': speechSound = "vowel";break;
			case 'a': speechSound = "vowel";break;
			case 'e': speechSound = "vowel";break;
			case 'i': speechSound = "vowel";break;
			case 'o': speechSound = "vowel";break;
			case 'u': speechSound = "vowel";
			default: speechSound = "consonant";
		}
		
		// Print result
		System.out.println(inputChar + " is a " + speechSound);

	}

}
