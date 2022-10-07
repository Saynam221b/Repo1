package apis;

import java.time.LocalDate;
import java.time.Month;

public class QS1 {
	
	
	public static void DateTime() {
	LocalDate d = LocalDate.now();

	
	LocalDate specificDate = d.withDayOfMonth(26).withYear(2022).withMonth(1);
	System.out.println("Details of 26 jan "+specificDate);
	Month m = specificDate.getMonth();
	System.out.println(m);
}
	
	public static void main(String args[]) {
		
		
		DateTime();
		
	}
	
	
	
	
	
}