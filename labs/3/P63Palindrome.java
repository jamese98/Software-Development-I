package lab3;
import java.util.Scanner;

public class P63Palindrome {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Get integer from user
		System.out.print("Enter test integer: ");
		int number = input.nextInt();
		
		// Check if number is palindrome and output result
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
		
				
	}
	
	public static int reverse(int number) {
			int reverseNumber = 0; // initialize reverseNumber variable
			
			// Reverse the number
			while (number != 0) { 
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number % 10;
			number = number / 10;
			}
			return reverseNumber; // return result
	}
	
	public static boolean isPalindrome(int number) {
		
		// Check if input is the same if it is reversed
		if (number == reverse(number)) {
			return true;
		} else {
			return false;
		}
	}

}
