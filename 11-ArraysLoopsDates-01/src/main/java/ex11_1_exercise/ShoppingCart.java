package ex11_1_exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import statements here:

public class ShoppingCart {
	public static void main(String[] args) {
		// Declare a LocalDateTime object, orderDate
		LocalDateTime locatDateTime;

		// Initialize the orderDate to the current date and time. Print it.
		locatDateTime = LocalDateTime.now();

		System.out.println("Current date: " + locatDateTime);

		// Format orderDate using ISO_LOCAL_DATE; Print it.

		String localeDateTimeFormatted = locatDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);

		System.out.println("current date formatted: " + localeDateTimeFormatted);

		localeDateTimeFormatted = locatDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

		System.out.println("current date formatted: " + localeDateTimeFormatted);
		
		localeDateTimeFormatted = locatDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);

		System.out.println("current date formatted: " + localeDateTimeFormatted);
		
		localeDateTimeFormatted = locatDateTime.format(DateTimeFormatter.ISO_WEEK_DATE);

		System.out.println("current date formatted: " + localeDateTimeFormatted);
		
		localeDateTimeFormatted = locatDateTime.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' YYYY'.'"));

		System.out.println("current date formatted: " + localeDateTimeFormatted);

	}
}