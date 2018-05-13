package core1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateDemo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
			
	      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
			
	       //parse a string
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);

		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014="+hundredDay2014);

	}

}
