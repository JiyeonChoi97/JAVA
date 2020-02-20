package Thread;

public class Mythread1 extends Thread {

	public void run() {
		for(int i =0; i<300;i++) {
			System.out.println("-");
		}
	}

}
