package Unit;

public abstract class Unit {

	int x;
	int y;
	
	// �߻�޼���
	abstract void move(int x, int y);	
	void stop() {
		System.out.println("stop()");
	};
	
	
}
