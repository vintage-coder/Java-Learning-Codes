import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateAndTime
{
	public static void main(String[] args)
	{
		LocalDateTime current=LocalDateTime.now();

		System.out.println("The Current Date and Time is: " + current);

		DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

		DateTimeFormatter formatter2=DateTimeFormatter.BASIC_ISO_DATE;

		String formatted1=current.format(formatter1);

		String formatted2=current.format(formatter2);

		String formatted3=current.format(formatter3);

		System.out.println("The Formatted1 current Date and Time is: " + formatted1);

		System.out.println("The Formatted2 current Date and Time is: " + formatted2);

		System.out.println("The Formatted3 current Date and Time is: " + formatted3);

	}
}