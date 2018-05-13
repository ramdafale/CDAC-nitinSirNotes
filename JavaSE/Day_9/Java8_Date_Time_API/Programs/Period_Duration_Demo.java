package core1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;


public class Period_Duration_Demo {

	public static void main(String[] args) {
		
	      //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //add 1 month to the current date
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);
	      
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);

	      LocalTime time1 = LocalTime.now();
	      Duration twoHours = Duration.ofHours(2);
			
	      LocalTime timeParis = LocalTime.now(ZoneId.of("Europe/Paris"));
	      Duration duration = Duration.between(time1, timeParis);
			
	      System.out.println("Duration: " + duration);

		
		
	
	}

}
