package lab1;
import java.util.Scanner;

public class P21CelsiusToFarenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input and store input in variable
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		// Convert input to Fahrenheit
		double fahrenheit = ((9.0 / 5) * celsius + 32);
		
		// Print result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
