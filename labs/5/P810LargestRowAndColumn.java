package lab5;

public class P810LargestRowAndColumn {

	public static void main(String[] args) {
		// Initialize matrix
		int[][] matrix = new int[4][4];
		
		// Randomly generate 0s and 1s and populate matrix
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		// Print matrix
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		// Calculate and display largest row
		System.out.println("The largest row index: " + largestRowIndex(matrix));
		
		// Calculate and display largest column
		System.out.println("The largest column index: " + largestColumnIndex(matrix));

	}
	
	/** Method to find index of largest row */
	public static int largestRowIndex(int[][] matrix) {
		// Init
		int biggestIndex = 0; // initialize variable to hold biggest index
		int biggestNumber = 0; // initialize variable to hold biggest number
		
		// Check if number in row is a 1
		for(int i = 0; i < matrix.length; i++) {
			int count = 0; // initialize counter 
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1) {
					count++; // increment counter
				}
			}
			
			// Update biggest number and corresponding index
			if (count > biggestNumber) {
				biggestNumber = count;
				biggestIndex = i;
			}
		}
		// Return result
		return biggestIndex;
	}
	
	/** Method to find index of largest column */
	public static int largestColumnIndex(int[][] matrix) {
		// Init
		int biggestIndex = 0; // initialize variable to hold biggest index
		int biggestNumber = 0; // initialize variable to hold biggest number
		
		// Check if number in column is a 1
		for(int i = 0; i < matrix[0].length; i++) {
			int count = 0; // initialize counter
			for(int j = 0; j < matrix.length; j++) {
				if(matrix[j][i] == 1) {
					count++; // increment counter
				}
			}
			
			// Update biggest number and corresponding index
			if (count > biggestNumber) {
				biggestNumber = count;
				biggestIndex = i;
			}
		}
		
		// Return result
		return biggestIndex;
	}

}
