package lab5;

import java.util.Scanner;

public class P711ComputeDeviation {

	public static void main(String[] args) {
		// Init
		Scanner input = new Scanner(System.in); // Initialize scanner
		double[] array = new double[10]; // Initialize array to store input numbers
		
		// Prompt user for ten numbers and add to array
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		
		// Print results
		System.out.println("The mean is " + mean(array));
		System.out.println("The standard deviation is " + deviation(array));

	}
	
	/** Method to compute deviation of double values */
	public static double deviation(double[] x) {
		// Init
		double[] deviationArray = new double[10]; // temp array to store numbers being calculated
		double deviationArrayLength = deviationArray.length; // stores length of deviationArray in double var
		double deviation = 0; // stores final calculated standard deviation
		
		// Subtract mean of each number and square result
		for(int i = 0; i < x.length; i++) {
			deviationArray[i] = (x[i] - mean(x) * (x[i] - mean(x)));	
		}
		
		// Find sum of deviationArray
		for (int i = 0; i < deviationArray.length; i++) {
			deviation += deviationArray[i];
		}
		
		// Find mean of deviationArray and store for final calculations
		deviation /= deviationArrayLength;
		
		// Square deviation and return results
		return Math.sqrt(deviation);
	}
	
	/** Method to compute the mean of an array of double values */
	public static double mean(double[] x) {
		double sum = 0; // Initialize sum variable
		
		// Find sum of numbers in array
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		double length = x.length; // store array length as double value
		return(sum / length); // calculate final average and return result
	}

}
