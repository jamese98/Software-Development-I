package lab6;
import java.util.GregorianCalendar;

public class P95GregorianCalendar {
	/** Main Method */
	public static void main(String[] args) {
		// Create calendar object
		GregorianCalendar calendar = new GregorianCalendar();
		
		// Display current date
		System.out.println("Today is: " + 
		                    calendar.get(calendar.MONTH) + "/" +
		                    calendar.get(calendar.DAY_OF_MONTH) + "/" +
		                    calendar.get(calendar.YEAR));
		
		// Set elapsed time since 1/1/1970
		calendar.setTimeInMillis(1234567898765L);
		
		// Display elapsed time since 1/1/1970
		System.out.println("Elapsed time since 1/1/1970 at 1234567898765L: " +
				            calendar.get(calendar.MONTH) + "/" +
				            calendar.get(calendar.DAY_OF_MONTH) + "/" +
				            calendar.get(calendar.YEAR));
	}

}
