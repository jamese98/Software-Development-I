package lab5;
import java.util.Scanner;

public class P81SumColumnByColumn {

	public static void main(String[] args) {
		// Call getArray method to prompt user for input
		double[][] array = getArray();
		
		// Display sum of each column
		for(int i = 0; i < array[0].length; i ++) {
			System.out.println("Sum of the elements at column " + i +  " is " + sumColumn(array,i));
		}

	}
	
	/** Method to get array input from user and build array */
	private static double[][] getArray() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[][] m = new double[3][4];
		
		// Prompt user for input
		System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row");
		// Populate array
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();
		// Return array
		return m;
	}
	
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0; // initialize sum variable
		// Add each item in array
		for(int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		// Return sum
		return sum;
	}
	
	

	


}
