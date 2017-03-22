package lab7;

public class P10_11 {
	public static void main(String[] args) {
		// Create Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 2.5);
		
		// Display perimeter of c1
		System.out.println("Perimeter: " + c1.getPerimeter());
		
		// Display area of c1
		System.out.println("Area: " + c1.getArea());
		
		// Check if c1 contains circle 3, 3
		System.out.println("c1 contains circle 3, 3: " + c1.contains(3, 3));
		
		// Check if c1 contains circle 4, 5, 10.5
		System.out.println("c1 contains circle 4, 5, 10.5: " + c1.contains(new Circle2D(4, 5, 10.5)));
		
		// Check if c1 overlaps circle 3, 5, 2.3
		System.out.println("c1 overlaps circle 3, 5, 2.3: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
