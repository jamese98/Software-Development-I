package lab6;
import java.util.Scanner;

public class P911LinearEquations {
	
	/** Main Method */
	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a - f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Call linearequation constructor
		P911LinearEquations linearEquation = new P911LinearEquations(a, b, c, d, e, f);
		
		// Display results
		if(linearEquation.isSolvable()) {
			System.out.println("x = " + linearEquation.getX());
			System.out.println("y = " + linearEquation.getY());
		} else {
			System.out.println("The equation is not solvable");
		}
	}
	

	//Initialize variables
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	/** Constructor: Call linear equation */
	P911LinearEquations(double a, double b, double c, double d, double e, double f) {
		// Assign each number passed to matching variable
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	/** Methods to get variables a - f */
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	/** Method: Check if problem can be solved */
	public boolean isSolvable() {
		return (a * d) - (b * c) != 0;
	}
	
	/** Methods to get x and y */
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	public double getY() {
		return((a * f) - (e * c)) / ((a * d) - (b * c));
	}
	
}
