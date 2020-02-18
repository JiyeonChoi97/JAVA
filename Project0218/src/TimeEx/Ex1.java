package TimeEx;

import java.time.LocalTime;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime nowTime = LocalTime.now();
		LocalTime editTime = nowTime.plusHours(2);
		LocalTime editTime2 = nowTime.minusHours(5);
		
		System.out.println(nowTime);
		System.out.println(editTime);
		System.out.println(editTime2);

	}

}
