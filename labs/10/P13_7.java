package lab10;

public class P13_7 {

	public static void main(String[] args) {
		// Create array of five Geometric Objects
		GeometricObject[] objects = {new Square(4), new Square(8.2), new Square(6.5), 
				                     new Square(3), new Square(1.5)};
		
		// Display area and how to color each objects
		for(int i = 0; i < objects.length; i++) { 
			System.out.println("Square " + (i + 1) + ":");
			System.out.println("Area: " + objects[i].getArea());
			System.out.println("How to color: " + ((Square)objects[i]).howToColor());
			System.out.println();
		}

	}

}
