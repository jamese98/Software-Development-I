package lab3;

public class P61PentagonalNumbers {

	public static void main(String[] args) {
			for (int i = 1; i <= 100; i++) {  // Initialize integer i; While i < 0, increment i
				System.out.print(getPentagonalNumber(i) + " ");  // Get pentagonal number for i
				
				// Print 10 numbers on each line
				if (i % 10 == 0) {  
					System.out.println();
				}
			}		

	}
	
	public static int getPentagonalNumber(int n) {
		// Return integer from pentagonal formula
		return ((n * (3 * n - 1)) / 2);
	}

}
