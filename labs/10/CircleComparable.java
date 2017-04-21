package lab10;

public class CircleComparable extends GeometricObject implements Comparable<CircleComparable> {
	private double radius;
	
	/** Creates a circle */
	public CircleComparable() {
	}
	
	/** Creates a circle with the specified radius */
	public CircleComparable(double radius) {
		this.radius = radius;
	}
	
	public CircleComparable(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public void printCircle() {
		System.out.println("The circle is created " + super.getDateCreated() +
			" and the radius is " + radius);
	}
	
	@Override
	public String toString() {
		return "A circle with radius " + radius + " " + super.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			return radius == ((Circle)o).getRadius();
		} else
			return false;
	}
	
	public int compareTo(CircleComparable circle) {
		if(this.radius > circle.getRadius()) {
			return 1;
		} else if(this.radius < circle.getRadius()) {
			return -1;
		} else {
			return 0;
		}
	}


}
