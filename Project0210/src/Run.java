import Time.Time;

public class Run {

	public static void main(String[] args) {

		Time t = new Time(12,12,12);
		
		t.printTime();
		t.setHour(10);
		t.setMinute(10);
		t.setSecond(10);
		t.printTime();
		
	}

}
