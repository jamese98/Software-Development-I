package lab4;
import java.util.Scanner;

public class P78AverageArrayOverload {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10]; // Initialize array to store numbers	
		
		// Prompt user to enter 10 double numbers
		System.out.print("Enter ten double numbers: ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		
		// Call average method and print
		System.out.println("The average is: " + average(array));
	}
	
	// Method to average integers
	public static int average(int[] array) {
		int sum = 0;
		
		// Find sum of array
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		// Return average of array
		return(sum / (array.length));
	}
	
	// Method to average doubles
	public static double average(double[] array) {
		double sum = 0;
		
		// Find sum of array
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		// Return average of array
		return(sum / (array.length));
	}

}
