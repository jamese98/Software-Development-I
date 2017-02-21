package lab5;

import java.util.Scanner;

public class P85AddMatrices {

	public static void main(String[] args) {
		// Create two matrices from user input user getArray method
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = getArray();
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = getArray();
		
		// Call matrixSum method to add arrays
		double[][] matrixSum = addMatrix(matrix1, matrix2);
		
		// Display results
		System.out.println("The matrices are added as follows");
		for(int i = 0; i < 3; i++) {
			// print first matrix
			print(matrix1, i);
			if(i == 1) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
			// print second matrix
			print(matrix2, i);
			if(i == 1) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");
			}
			// print sum matrix
			print(matrixSum, i);
			System.out.println();
		}

	}
	/** Method to add two matrices */
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// Initialize sum variable
		double[][] sum = new double[3][3];
		
		// Add matrices
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		// Return result
		return sum;
		
	}
	
	/** Method to get array input from user and build array */
	private static double[][] getArray() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[][] m = new double[3][3];
		
		// Populate array
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();
		// Return array
		return m;
	}
	
	/** Method to format and print matrix */
	public static void print(double[][] m, int x) {
		// Print matrix line
		for(int i = 0; i < m[x].length; i++) {
			System.out.print(m[x][i] + " ");
		}
	}	

}
