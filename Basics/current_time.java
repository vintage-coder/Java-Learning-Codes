import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.Instant;


public class CurrentDateAndTime
{
	public static void main(String[] args)
	{
		LocalDateTime current=LocalDateTime.now();

		System.out.println("The Current Date and Time is: " + current);

		DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		//DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");

		DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("ddMMyyyyHHmmssSSS");

		//DateTimeFormatter formatter2=DateTimeFormatter.BASIC_ISO_DATE;

		//DateTimeFormatter formatter2=DateTimeFormatter.ISO_INSTENT;

		DateTimeFormatter formatter2=DateTimeFormatter.ISO_LOCAL_DATE_TIME;

		String formatted1=current.format(formatter1);

		String formatted2=current.format(formatter2);

		String formatted3=current.format(formatter3);

		int epochsecond=(int)Instant.now().getEpochSecond();

		long epoch=(long)Instant.now().toEpochMilli();

		

		String epochMilliSecond =Long.toString(epoch);

		
		System.out.println("The epoch time Second Second :" + epochsecond);

		System.out.println("The epoch time milli Second Second :" + epochMilliSecond);


		System.out.println("The Formatted1 current Date and Time is: " + formatted1);

		System.out.println("The Formatted2 current Date and Time is: " + formatted2);

		System.out.println("The Formatted3 current Date and Time is: " + formatted3);

	}
}