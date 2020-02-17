package Unit;

public class Dropship extends Unit {

	void load() {
		System.out.println("Dropship.load()");
	}
	
	void unload() {
		System.out.println("Dropship.unload()");
	}
	void move(int x, int y) {
		System.out.println("Dropship.move(" + x +", " + y + ")");
	};
	
}
