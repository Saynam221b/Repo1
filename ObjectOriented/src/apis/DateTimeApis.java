package apis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeApis {

	public static void LocalDateTimeApis() {

		LocalDate d = LocalDate.now();
		System.out.println("Date is " + d);

		
		LocalTime t = LocalTime.now();
		System.out.println("Time is " + t);

		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Date and time is " + current);

		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = current.format(format);
		System.out.println("Formatted date time is" + formattedDateTime);
		
		
		//month and days
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getDayOfYear();
		
		System.out.println("Month"+month+" day "+day+" seconds "+seconds+" hour "+hour+"year "+year);
		
		LocalDate Date2 = LocalDate.of(1950, 1, 26);
		System.out.println("Republic day will be on "+Date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2022);
		System.out.println("Date on 24 oct will be "+specificDate);
	}
	
	public static void main(String args[]) {
		
		
		LocalDateTimeApis();
		
	}

}
