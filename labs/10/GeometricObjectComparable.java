package lab10;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	protected GeometricObjectComparable() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with specified color and filled value */
	protected GeometricObjectComparable(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** return color */
	public String getColor() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean, the method is called isFilled */
	public boolean isFilled() {
		return filled;
	}
	
	/** Set filled value */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** Get date created */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on "+ dateCreated + "\ncolor: " + color +
		  " and filled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(GeometricObjectComparable object) {
		if(this.getArea() > object.getArea()) {
			return 1;
		} else if (this.getArea() < object.getArea()) {
			return -1;
			
		} else {
			return 0;
		}
		
	}
	
	public static GeometricObjectComparable max(GeometricObjectComparable object1, GeometricObjectComparable object2) {
		if(object1.compareTo(object2) == 1) {
			return object1;
		} else {
			return object2;
		}
	}
}
