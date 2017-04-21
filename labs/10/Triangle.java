package lab10;

import lab9.GeometricObject;

public class Triangle extends GeometricObject {
	// Initialize data vars
	double side1;
	double side2;
	double side3;
	
	/** Class: Create default triangle */
	protected Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	
	}
	
	/** Class: Create triangle with with specified sides */	
	protected Triangle(double s1, double s2, double s3) 
		throws IllegalTriangleException {
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
			throw new IllegalTriangleException(side1, side2, side3);
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	/** Class: Create triangle with specified sides, color, and fill */
	protected Triangle(double s1, double s2, double s3, String color, boolean filled) 
			throws IllegalTriangleException {
		
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
			throw new IllegalTriangleException(side1, side2, side3);
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		this.color = color;
		this.filled = filled;
	}
	
	/** Methods: Return side1, side2, side3 */
	public double getS1() {
		return side1;
	}
	
	public double getS2() {
		return side2;
	}
	
	public double getS3() {
		return side3;
	}
	
	/** Methods: Calculate and return area and perimeter */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
	}

}

