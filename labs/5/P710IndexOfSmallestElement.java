package lab5;
import java.util.Scanner;
import java.util.Arrays;

public class P710IndexOfSmallestElement {

	public static void main(String[] args) {
		// Init
		Scanner input = new Scanner(System.in); // Initialize scanner
		double[] array = new double[10]; // Initialize array to store numbers
		
		// Prompt user for ten numbers and add to array
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		
		// Call method and output results
		System.out.println("The smallest number is contained at index: " + indexOfSmallestElement(array));
		
	}
	
	// method to find index of smallest number in array
	public static int indexOfSmallestElement(double[] array) {
		// Init
		double smallestNumber = 999999999; // Initialize variable to hold smallest number
		int smallestNumberIndex = 0; // Initialize variable to hold index of smallest number
		
		// Find smallest number and save it and its index in variables
		for(int i = 0; i < array.length; i++) {
			if (array[i] < smallestNumber) {
				smallestNumber = array[i];
				smallestNumberIndex = i;
			}
		}
		// Return result
		return smallestNumberIndex;
	}

}
