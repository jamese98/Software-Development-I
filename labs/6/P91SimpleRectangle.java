package lab6;

public class P91SimpleRectangle {
	/** Main method */
	public static void main(String[] args) {
		// Create a rectangle with width 4 and height 40
		P91SimpleRectangle rectangle1 = new P91SimpleRectangle(4, 40);
		System.out.println("Rectangle 1:" +
				           " Width = " + rectangle1.width + 
				           " Height = " + rectangle1.height + 
				           " Area = " + rectangle1.getArea() +
						   " Perimeter = " + rectangle1.getPerimeter());
		
		// Create a rectangle with width 3.5 and height 35.9
		P91SimpleRectangle rectangle2 = new P91SimpleRectangle(3.5, 35.9);
		System.out.println("Rectangle 2: " +
				           " Width = " + rectangle2.width +
				           " Height = " + rectangle2.height +
				           " Area = " + rectangle2.getArea() +
				           " Perimeter = " + rectangle2.getPerimeter());
	}
	
	// Initialize variables
	double width;
	double height;
	
	/** Construct rectangle with default width and height 1 */
	P91SimpleRectangle() {
		width = 1;
		height = 1;
	}
	
	/** Construct rectangle with specified width and height */
	P91SimpleRectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	/** Return area of rectangle */
	double getArea() {
		return width * height;
	}
	
	/** Return perimeter of rectangle */
	double getPerimeter() {
		return 2 * (width + height);
	}
	

}
