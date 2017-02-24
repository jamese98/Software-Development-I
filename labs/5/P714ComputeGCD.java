package lab5;
import java.util.Scanner;

public class P714ComputeGCD {

	public static void main(String[] args) {
		// Init
		Scanner input = new Scanner(System.in); // Initialize scanner
		int[] array = new int[5]; // Initialize array to store input numbers
		
		// Prompt user for five numbers and add to array
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			array[i] = input.nextInt();
		}
		
		// Call GCD method and print result
		System.out.println("The GCD is: " + gcd(array));
	}
	
	/** Method to find GCD */
	public static int gcd(int... numbers) {
		int gcd = 1; // initialize varaible to store gcd
		boolean isDivisor = true; // initialize boolean to determine if number is divisor
		
		// Cycle through each number
		for(int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			// Check if number is a divisor
			for(int j: numbers) {
				// Number is not a divisor
				if (j % i != 0) {
					isDivisor = false;
				}
			}
			// Number is a divisor
			if (isDivisor) {
				gcd = i;
			}
		}
		// Return result
		return gcd;
	}
	
	/** Method to find smallest number */
	public static int min(int... numbers) {
		int min = numbers[0]; // initialize with first number
		// Cycle through all numbers
		for(int i: numbers) {
			// Check if i is the smallest number
			if (i < min) { // JA: This has to include min (<=)
				min = i; // i is the smallest number, assign to min
			}
		}
		
		// return result
		return min;
		
	}

}
