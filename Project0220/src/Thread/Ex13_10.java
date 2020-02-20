package Thread;

public class Ex13_10 {

	public static void main(String[] args) {

		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			System.out.println();
			Thread.sleep(2000);
			th2.suspend();
			System.out.println();
			Thread.sleep(3000);
			th1.resume();
			System.out.println();
			Thread.sleep(3000);
			th1.stop();
			System.out.println();
			th2.stop();
			System.out.println();
			Thread.sleep(2000);
			th3.stop();
			System.out.println();
			
		}catch(InterruptedException e) {}
	}

}
