package lab10;

public class IllegalTriangleException extends Exception {
	// Initialize side variables
	private double side1;
	private double side2;
	private double side3;
	
	/** Constructor: Exception to check for illegal triangle sides */
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Illegal Sides: " + side1 + ", " + side2 + ", " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Method: Return side1 of triangle */
	public double getSide1() {
		return side1;
	}
	
	/** Method: Return side2 of triangle */
	public double getSide2() {
		return side2;
	}
	
	/** Method: Return side3 of triangle */
	public double getSide3() {
		return side3;
	}
}
