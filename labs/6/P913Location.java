package lab6;
import java.util.Scanner;

import javax.xml.stream.Location;

public class P913Location {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input of 2D array
		System.out.println("Enter the number of rows and columns in this array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		// Create array
		double[][] array = new double[rows][columns];
		System.out.println("Enter the array: ");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		// Call location constructor
		P913Location max = locateLargest(array);
		
		// Display results
		System.out.println("The location of the largest element is " + max.maxValue + " at (" + 
		                   max.row + ", " + max.column + ")");
	}
	
	/** Method: Find largest instance in array */
	public static P913Location locateLargest(double[][] array) {
		return new P913Location(array);
	}

	// Initialize variables
	int row;
	int column;
	double maxValue;
	
	/** Constructor: Create location object */
	P913Location(double[][] array) {
		maxValue = array[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < array.length; i++) { // increments first part of 2D array
			for (int j = 0; j < array[i].length; j++) { // increments second part of 2D array
				// Sets new maxValue and increments row and column
				if(array[i][j] > maxValue) {
					maxValue = array[i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
