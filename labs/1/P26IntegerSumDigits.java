package lab1;
import java.util.Scanner;

public class P26IntegerSumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for integer
		System.out.print("Enter an integer between 0 and 1000: ");
		int userInt = input.nextInt();
		int sum = 0;
		
		// Calculate 
		while (userInt  > 0) {
			sum = (sum + userInt % 10);
			userInt = userInt / 10;
		}
		
		// Display result
		System.out.println("The sum of the digits is " + sum);

	}

}
