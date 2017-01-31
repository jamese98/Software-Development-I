package lab1;
import java.util.Scanner;

public class P25GratuityCalculator {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user for subtotal and gratuity and store them in variables
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double gratuity = ((rate / 100) * subtotal); // Calculate gratuity amount
		double total = (gratuity + subtotal); // Calculate total
		
		//Print subtotal and gratuity rate
		System.out.println("The gratuity is " + gratuity + " and the total is " + total);

	}

}
