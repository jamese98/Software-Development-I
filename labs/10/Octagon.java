package lab10;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;
	
	/** Creates a circle */
	public Octagon() {
	}
	
	/** Creates a circle with the specified radius */
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	/** String description of octagon */
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
	
	/** Compare octagons */
	public int compareTo(Octagon octagon) {
		if(getArea() > octagon.getArea()) {
			return 1;
		} else if(getArea() < octagon.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
