package lab2;
import java.util.Scanner;

public class P32AdditionQuizInt3 {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10); // Generate number 1
		int number2 = (int)(System.currentTimeMillis() /7 % 10); // Generate number 2
		int number3 = (int)(System.currentTimeMillis() /5 % 10); // Generate number 3
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " is " + (number1 + number2 + number3 == answer));
		// JA: The right statement should be:
		// System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
		
		
		
	}

}
