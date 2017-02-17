package lab4;

public class P74AnalyzeScores {

	public static void main(String[] args) {
		// JA: You had to read the values from the user
		int[] myArray = {1,2,3,4,5,6,7,8,9,10,-1}; // initialize array 
		int sum = 0; // initialize variable to store sum of array
		int average = 0; // initialize variable to store average
		int belowAverage = 0; // initialize belowAverage counter
		int aboveAverage = 0; // initialize equal and aboveAverage counter
		
		// Get sum of integers in array
		for(int i = 0; i < (myArray.length - 1) && i >= 0; i++) {
			sum = sum + i;
		}
		
		// Get average of integers in array
		average = sum / (myArray.length); // JA: This has to be a non-integer calculation
		
		// Check if each integer in the array is above or below average
		for(int i = 0; i < (myArray.length - 1) && i >= 0; i++) {
			// below average, increment counter
			if (i < average) {
				belowAverage++;
			  // above average, increment counter
			} if (i >= average) {
				aboveAverage++;
			}
		}
		
		// Output results
		System.out.println("Number of scores above or equal to average: " + aboveAverage);
		System.out.println("Number of scores below average: " + belowAverage);


	}

}
