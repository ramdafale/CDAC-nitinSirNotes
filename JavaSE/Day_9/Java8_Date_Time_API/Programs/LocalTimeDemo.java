package core1;

import java.time.LocalTime;
import java.time.ZoneId;


public class LocalTimeDemo 
{

	public static void main(String[] args) {
		
		//Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+time);
		
		//Creating LocalTime by providing input arguments
		LocalTime specificTime = LocalTime.of(12,20,25,40);
		System.out.println("Specific Time of Day="+specificTime);
		
		
		
		
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST="+timeKolkata);
		
		//Current date in "Europe/Paris", you can get it from ZoneId javadoc
		LocalTime timeParis = LocalTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Current Time in Paris="+timeParis);
		
		
		

	}

}
