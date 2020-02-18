package TimeEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(now);
		
		LocalDate lDate = now.toLocalDate();
		System.out.println(lDate);
		
		LocalTime lTime = now.toLocalTime();
		System.out.println(lTime);
		
		LocalDateTime lDT = now.toLocalDateTime();
		System.out.println(lDT);

	}

}
