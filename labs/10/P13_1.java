package lab10;
import java.util.Scanner;

public class P13_1 {
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for color
		System.out.print("Enter triangle color: ");
		String color = input.next();
		
		// Prompt user whether triangle is filled
		System.out.print("Fill triangle (true/false)");
		boolean filled = input.nextBoolean();
		
		// Side size error checking
		boolean repeatSides = true;
		
		do {
			// Prompt user for three sides of triangle
			System.out.println("Enter three sides of triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
			try {
				
				// Create triangle based on input preferences
				Triangle triangle = new Triangle(side1, side2, side3, color, filled);
				repeatSides = false;
				
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
			catch(IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}
		} while(repeatSides);
	
	}

}
