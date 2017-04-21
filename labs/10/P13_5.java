package lab10;

public class P13_5 {
	public static void main(String[] args) {
		// Compare two circles
		// Create two circle objects
		Circle circle1 = new Circle(5, "blue", true);
		Circle circle2 = new Circle(10, "green", false);
		
		// Print circle1 and circle2
		System.out.println("Circle 1: " + circle1);
		System.out.println("Circle 2: " + circle2);
		
		// Print larger circle
		System.out.println("The larger circle is " + (Circle.max(circle1, circle2)));
		System.out.println();
		
		// Compare two rectangles
		// Create two rectangle objects
		Rectangle rectangle1 = new Rectangle(5, 8, "blue", true);
		Rectangle rectangle2 = new Rectangle(10, 14, "green", false);
		
		// Print rectangle1 and rectangle2
		System.out.println("Rectangle 1: " + rectangle1);
		System.out.println("Rectangle 2: " + rectangle2);
		
		// Print larger rectangle
		System.out.println("The larger rectangle is " + (Rectangle.max(rectangle1, rectangle2)));
	}

}
