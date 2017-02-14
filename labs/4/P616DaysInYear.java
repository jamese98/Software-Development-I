package lab4;

public class P616DaysInYear {

	public static void main(String[] args) {
		// Find number of days between 2000 - 2020 using numberOfDaysInAYear method
		System.out.println((numberOfDaysInAYear(2020)) - (numberOfDaysInAYear(2000)));

	}
	
	public static int numberOfDaysInAYear(int year) {
		int total = 0; // initialize variable to store number of variables
		
		// Get the total days from 1900 to 1/1/year
		for (int i = 1900; i < year; i++) {
			
			// Check if year is leap year
			if (isLeapYear(year))
				total = total + 366;
			else
				total = total + 365;
		}
		return total;
	}
	
	// Method to check if year is leap year
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
