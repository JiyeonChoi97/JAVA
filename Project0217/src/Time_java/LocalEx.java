package Time_java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.TemporalField;

public class LocalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		
		LocalDate birthDate = LocalDate.of(1997, 8, 7);
		LocalTime birthTime = LocalTime.of(04, 00, 5);

		Year year = Year.of(2019);
		
		
		System.out.println(today);
		System.out.println(now);
		
		System.out.println("==================");
		System.out.println(birthDate);
		System.out.println(birthTime);
		System.out.println("==================");
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.isLeapYear());
		System.out.println("==================");
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
	}

}
