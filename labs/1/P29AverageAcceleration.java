package lab1;
import java.util.Scanner;


public class P29AverageAcceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for v0, v1, and t
		System.out.print("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		//Compute average acceleration
		double avgAcceleration = (v1 - v0) / t;
		
		//Display results
		System.out.println("The average acceleration is: " + avgAcceleration);
		

	}

}
