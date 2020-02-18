package TimeEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex4 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
	
		LocalDate date = dt.toLocalDate();
		LocalTime time = dt.toLocalTime();
		
		System.out.println(dt);
		System.out.println(date);
		System.out.println(time);
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
		
		System.out.println(zid);
		System.out.println(zdt);
		
		ZoneId nyzid = ZoneId.of("America/New_York");
		ZonedDateTime nyzdt = dt.atZone(nyzid);
		
		System.out.println(nyzid);
		System.out.println(nyzdt);
	}
	

}
