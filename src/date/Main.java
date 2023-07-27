package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *  Nathan Barros
 */

public class Main {
	public static void main(String[] args) {
 		
		// LocalDate - simple date
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate.of(2001, Month.AUGUST, 4); // 04/08/2001
		
		// LocalTime - hour
		LocalTime hour = LocalTime.now();
		System.out.println(hour);
		
		LocalDate.of(12, 00, 00); // 12:00:00
		
		// LocalDateTime
		LocalDateTime lct = LocalDateTime.now();
		System.out.println(lct);
		
		/*
		 * Instant represents a time line
		 * moment (starts counting at 01/01/1970)
		 * 
		 * Doesn't keep time zone information
		 * uses GMT/UTC
		 */
		Instant iNow = Instant.now();
		System.out.println(iNow); 
		
		Instant i = Instant.ofEpochMilli(100000L);
		System.out.println(i);
		
		/*
		 * ZonedDateTime keeps time zone information
		 * like continent, state where code are running
		 */
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		// Creating a custom zoneId
		ZoneId zoneId = ZoneId.of("America/Montevideo");
		// Using on ZonedDateTime (LocalDateTime and ZonedId)
		ZonedDateTime zdt2 = ZonedDateTime.of(lct, zoneId);
		System.out.println(zdt2);
	}
}
