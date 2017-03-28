package lab8;
import java.util.Scanner;

public class P11_1 {
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for three sides of triangle
		System.out.println("Enter three sides of triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Prompt user for color
		System.out.print("Enter triangle color: ");
		String color = input.next();
		
		// Prompt user whether triangle is filled
		System.out.print("Fill triangle (true/false)");
		boolean filled = input.nextBoolean();
		
		// Create triangle based on input preferences
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		// Output result
		System.out.println();
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Filled: " + triangle.isFilled());		
	
	}

}
