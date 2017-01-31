package lab2;
import java.util.Scanner;

public class P35FutureDates {

	public static void main(String[] args) {
		
		// Initialize scanner
		Scanner input = new Scanner (System.in);
		
		// Prompt user for date and store input in variable
		System.out.print("Enter today's date: ");
		int dayInput = input.nextInt();
		
		// Prompt user for days elapsed and store input in variable
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		
		// Convert current day integer into string
		String dayString = "";
		switch (dayInput) {
			case 0: dayString = "Sunday";break;
			case 1: dayString = "Monday";break;
			case 2: dayString = "Tuesday";break;
			case 3: dayString = "Wednesday";break;
			case 4: dayString = "Thursday";break;
			case 5: dayString = "Friday";break;
			case 6: dayString = "Saturday";
			default: System.out.println("Invalid entry. Please enter an integer that matches a day eg. Sunday = 0");
		}
		
		// Convert future day integer into string
		int futureDay = dayInput + daysElapsed;
		String futureDayString = "";
		switch (futureDay % 7) {
		case 0: futureDayString = "Sunday";break;
		case 1: futureDayString = "Monday";break;
		case 2: futureDayString = "Tuesday";break;
		case 3: futureDayString = "Wednesday";break;
		case 4: futureDayString = "Thursday";break;
		case 5: futureDayString = "Friday";break;
		case 6: futureDayString = "Saturday";
		default: System.out.println("Invalid entry. Please enter an integer");
		}
		
		// Display results
		System.out.println("Today is " + dayString + " and the future day is " + futureDayString);

	}

}
