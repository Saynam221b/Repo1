package apis;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoApi {
	
	public static void CHromoUnit() {
		
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date is "+date);
		
		
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("Next to next year is"+ year);
		
		
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month is "+nextMonth);
		
		
		LocalDate nextWeek = date.plus(1,ChronoUnit.WEEKS);
		System.out.println("Next week is "+nextWeek);
	
		
		LocalDate Decade = date.plus(2,ChronoUnit.DECADES);
		System.out.println("Next decade is "+ Decade);
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CHromoUnit();

	}

}
