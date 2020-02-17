package Unit;

public abstract class Unit {

	int x;
	int y;
	
	// 추상메서드
	abstract void move(int x, int y);	
	void stop() {
		System.out.println("stop()");
	};
	
	
}
