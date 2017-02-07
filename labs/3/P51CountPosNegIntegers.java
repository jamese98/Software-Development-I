package lab3;
import java.util.Scanner;

public class P51CountPosNegIntegers {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Get integer input from user
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int data = input.nextInt();
		int intEntered = 1;
		
		// Check if first number is sentinel
		if (data == 0) {
			System.out.println("No numbers are entered except for 0 ");
			System.exit(0);
		}
		
		// Read data until input is 0
		int sum = 0;
		int numNeg = 0;
		int numPos = 0;
		while (data != 0) {
			
			sum += data; // Add input to sum
			
			// Increment negative number counter
			if (data < 0) {
				++numNeg;
			}
			
			// Increment positive number counter
			if (data > 0) {
				++numPos;
			}
			
			// Read next input
			System.out.print("Enter an integer, the input ends if it is 0: ");
			data = input.nextInt();
		}
		
		// Output results
		System.out.println("The number of positives is: " + numPos);
		System.out.println("The number of negatives is: " + numNeg);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + (sum / (numPos + numNeg)));

	}

}
