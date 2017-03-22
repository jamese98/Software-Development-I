package lab7;
import java.util.Scanner;

public class P10_5 {
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input integer
		System.out.println("Enter a positive integer: ");
		int userInt = input.nextInt();
		
		// Calculate and display smallest factors of number in decreasing order
		System.out.println("The smallest factors of " + userInt + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); // Create stack of integers object
		
		smallestFactors(userInt, stack);
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println();		
	}
	
	/** Determine smallest factors and push to StackOfIntegers */
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2;
		while (number / i != 1) {
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else i++;
		}
		stack.push(number);
	}

}
