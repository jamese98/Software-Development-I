package lab4;

public class P612DisplayCharacters {

	public static void main(String[] args) {
		// Call printChars method
		printChars('1', 'Z', 10);

	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		final int NUMBERS_PER_LINE = numberPerLine; // Assign numbers per line to final variable
		
		// Loop until all characters have been printed
		for(int i = ((int)ch1); i >= ((int)ch1) && i <= ((int)ch2); i++) {
			
			// Check if line has ten characters
			if (numberPerLine > 0) {
				System.out.print(((char)i) + " ");
				numberPerLine--;
			} if (numberPerLine == 0) { // line has ten characters, print new line
				numberPerLine = NUMBERS_PER_LINE;
				System.out.println();
			}	
		}
	}	
}
