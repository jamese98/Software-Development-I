package lab9;
import java.util.Scanner;

public class P12_3 {
	
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize array
		int array[] = new int[100];
		
		// Assign 100 random integers to array
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		
		// Prompt user to enter index of array
		System.out.print("Enter the index of the array: ");
		try {
			// Display corresponding element value
			System.out.println("The corresponding element value is " + 
					array[input.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error: Out of bounds");
		}
	}

}
