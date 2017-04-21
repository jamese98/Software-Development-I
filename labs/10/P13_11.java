package lab10;

public class P13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Create octagon object
		Octagon octagon1 = new Octagon(4, "blue", true);
		
		// Clone octagon
		Octagon octagon2 = new Octagon();
		octagon2 = (Octagon)octagon1.clone();

		
		// Display area and perimeter of octagons
		System.out.println("Octagon 1: ");
		System.out.println("Area: " + octagon1.getArea());
		System.out.println("Perimeter: " + octagon1.getPerimeter());
		System.out.println();
		
		System.out.println("Octagon 2: ");
		System.out.println("Area: " + octagon2.getArea());
		System.out.println("Perimeter: " + octagon2.getPerimeter());
		System.out.println();
		
		// Compare octagons
		if(octagon1.compareTo(octagon2) == 1) {
			System.out.println("Octagon 1 is larger than octagon 2");
		} else {
			System.out.println("Octagon 1 is smaller than octagon 2");
		}
		
	}

}
