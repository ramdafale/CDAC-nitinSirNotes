package core1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Month;


public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		//Current Date
				LocalDateTime today = LocalDateTime.now();
				System.out.println("Current DateTime="+today);
				
				//Current Date using LocalDate and LocalTime
				today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
				System.out.println("Current DateTime="+today);
				
				//Creating LocalDateTime by providing input arguments
				LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
				System.out.println("Specific Date="+specificDate);
				
				
				
				
				//Current date in "Asia/Kolkata"
				LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
				System.out.println("Current Date in IST="+todayKolkata);

		

				//Current date in "Europe/Paris"
				LocalDateTime todayParis = LocalDateTime.now(ZoneId.of("Europe/Paris"));
				System.out.println("Current Date in Paris="+todayParis);


		
		
	
	}

}
