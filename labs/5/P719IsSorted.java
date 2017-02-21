package lab5;

import java.util.Scanner;

public class P719IsSorted {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in); 
		
		// Prompt user to enter list length
		System.out.print("Enter list length: ");
		
		// Get first number of input to determine list size
		int n = input.nextInt();
		int[] array = new int[n]; // create array
		
		
		// Add next inputs to array
		System.out.println("Enter " + n + " integers:"); // prompt user for integers to enter into list
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		// Use isSorted method to determine is list is sorted
		if (isSorted(array)) {  // list is sorted
			System.out.println("The list is already sorted");
		} else {  // list is not sorted
			System.out.println("The list is not sorted");
		}
	
	}

	/** Method to determine is list is sorted */
	public static boolean isSorted(int[] list) {
		boolean isSorted = true; // Initialize isSorted variable
		for(int i = 0; i < list.length - 1; i++) { // list is not sorted
			if (list[i] > list [i + 1]) {
				isSorted =  false;
			} else { // list is sorted
				isSorted =  true;
			}
		}
		// Return result
		return isSorted;
	}

}
