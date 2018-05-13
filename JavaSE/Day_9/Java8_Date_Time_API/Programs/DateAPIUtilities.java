package core1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;


public class DateAPIUtilities {

	public static void main(String[] args) {
		
LocalDate today = LocalDate.now();
		
		//Get the Year, check if it's leap year
		System.out.println("Year "+today.getYear()+" is Leap Year? "+today.isLeapYear());
		
		//Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? "+today.isBefore(LocalDate.of(2015,1,1)));
		
		//Create LocalDateTime from LocalDate
		System.out.println("Current Time="+today.atTime(LocalTime.now()));
		
		//plus and minus operations
		System.out.println("10 days after today will be "+today.plusDays(10));
		System.out.println("3 weeks after today will be "+today.plusWeeks(3));
		System.out.println("20 months after today will be "+today.plusMonths(20));

		System.out.println("10 days before today  "+today.minusDays(10));
		System.out.println("3 weeks before today  "+today.minusWeeks(3));
		System.out.println("20 months before today  "+today.minusMonths(20));
		
		//Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= "+today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);
		
		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format= "+period);
		System.out.println("Months remaining in the year= "+period.getMonths());

		// with ChronoUnit Enum
      //add 1 week to the current date
      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
      System.out.println("Next week: " + nextWeek);
		
      //add 1 month to the current date
      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
      System.out.println("Next month: " + nextMonth);
		
      //add 1 year to the current date
      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
      System.out.println("Next year: " + nextYear);
		
      //add 10 years to the current date
      LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
      System.out.println("Date after ten year: " + nextDecade);
		
		
	
	}

}
