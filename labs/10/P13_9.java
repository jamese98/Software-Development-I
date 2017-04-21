package lab10;

public class P13_9 {

	public static void main(String[] args) {
		// Create two circle objects
		CircleComparable circle1 = new CircleComparable(4, "blue", true);
		CircleComparable circle2 = new CircleComparable(7, "green", false);
		
		// Display radii of circles
		System.out.println("Circle 1 radius: " + circle1.getRadius());
		System.out.println("Circle 2 radius: " + circle2.getRadius());
		
		// Compare circles
		if(circle1.equals(circle2)) {
			System.out.println("Circle 1 is equal to circle 2");
		} else {
			System.out.println("Circle 1 is not equal to circle 2");
		}

	}

}
