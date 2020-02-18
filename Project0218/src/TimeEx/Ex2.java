package TimeEx;

import java.time.LocalDate;

public class Ex2 {

	public static void main(String[] args) {

		LocalDate kDate = LocalDate.of(1999, 12, 31);
		LocalDate jDate = LocalDate.of(1999, 12, 31);
		
		System.out.println(kDate.equals(jDate));
		System.out.println(kDate.isEqual(jDate));
		
	}

}
