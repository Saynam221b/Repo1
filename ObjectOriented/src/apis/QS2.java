package apis;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class QS2 {
	

	public static void DateTime() {
	LocalDate d = LocalDate.now();

	
	LocalDate specificDate = d.withDayOfMonth(7).withYear(2030).withMonth(10);
	LocalDate ans = specificDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
	

	System.out.println("Details of wed "+ans);

}
	
	public static void main(String args[]) {
		
		
		DateTime();
		
	}

}
