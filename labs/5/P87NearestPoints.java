package lab5;

public class P87NearestPoints {

	public static void main(String[] args) {
		// Initialize array containing test points
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},  {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, 
				             {-1.5, 4, 2},  {5.5, 4, -0.5}};

		// p1, p2, p3 are indices in the points array
		int p1 = 0, p2 = 1, p3 = 3; // Initial three points
		
		// Initialize shortest distance
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], 
									points[p2][p1], points[p3][p2]);
		
		// Compute the distance for every two points
		for(int i = 0; i < points.length; i++) {
			for(int j = i + 1; j < points.length; j++) {
				// Call distance method to calculate
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], 
						            points[j][1], points[j][2]);
				
				// new shortest distance, update variables
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		// Display results
		System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + 
				           ") and (" + points[p2][0] + ", " + points[p2][1] + ")"); // JA: Forgot to print the z value
	}
	
	/** Method to calculate distance between two points */
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
		// Calculate using formula and return result
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

}
