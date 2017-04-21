package lab10;

public class Square extends GeometricObject implements Colorable {
	private double side;

	public Square() {
	}
	
	public Square(double side) {
	  this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
	  this.side = side;
	  setColor(color);
	  setFilled(filled);
	}	
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
	   this.side = side;	
	}
	
	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}
	
	@Override
	public String howToColor() {
		return "Color all four sides";
	}

}
