package lab7;

public class Circle2D {
	// Initialize variables
	private double x;
	private double y;
	private double radius;
	
	/** Constructor: create default circle */
	Circle2D() {
		this(0, 0, 1);
	}
	
	/** Constructor: create circle with specified values*/
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/** Methods: Get x, y, and radius */
	// Get x
	public double getX() {
		return x;
	}
	
	// Get y
	public double getY() {
		return y;
	}
	
	// Get radius
	public double getRadius() {
		return radius;
	}
	
	/** Methods: Calculate area and perimeter of circle */
	// Get area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	// Get perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	/** Method: Check if specified point is in circle */
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
	}
	
	/** Method: Check if specified circle is in circle */
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				Math.pow(circle.getY() - y, 2))
				<= Math.abs(radius - circle.getRadius());
	}
	
	/** Method: Check if specified circle overlaps another circle */
	public boolean overlaps(Circle2D circle){
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +
				Math.pow(circle.getY() - y, 2))
				<= radius + circle.getRadius();
	}

}
