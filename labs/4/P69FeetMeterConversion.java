package lab4;

public class P69FeetMeterConversion {

	public static void main(String[] args) {
		// Display table headings
		System.out.println("Feet       Meters   |   Meters      Feet");
		
		// Display table body
		double j = 20.0; // initialize meterToFoot placeholder variable
		for (double i = 1.0; i <= 10.0; i++) {
			
			// Print left side of table
			if (i == 10.0) { // Check if leftmost column is 10, fix placement
				System.out.print(i + "        ");	
			} else {
				System.out.print(i + "         ");
			}
			System.out.printf("%.3f", footToMeter(i)); 
			System.out.print("   |   ");	
			// Print right side of table
			j = j + 5;
			System.out.print(j + "        ");
			System.out.printf("%.3f", meterToFoot(j)); 
			System.out.println(); // new line, loop and go to next column
				
			}
		}
		
	// Method to convert from feet to meters
	public static double footToMeter(double foot) {
		return (foot * .305);
	}
	
	// Method to convert from meters to feet
	public static double meterToFoot(double meter) {
		return (meter * 3.279);
	}

}
