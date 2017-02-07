package lab3;
import java.util.Scanner;

public class P516FactorsofInteger {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter an integer: ");
		int userInt = input.nextInt();
		
		// Determine factors of integer
		for (int i = 2; i <= userInt; i++) {
			while(userInt % i == 0) {
				
				// Output factors
				System.out.print(i + " ");
				userInt = userInt / i;
			}
			
		}

	}

}
