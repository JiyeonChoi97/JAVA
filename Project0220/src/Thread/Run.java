package Thread;

public class Run {

	public static void main(String[] args) {


		Mythread1 th1 = new Mythread1();
		Mythread2 th2 = new Mythread2();
		th1.run();
		th2.run();
	
	}

}
