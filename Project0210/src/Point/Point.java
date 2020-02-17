package Point;

public class Point {

	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
	
	void setValue() {
		x = 7;
		y = 8;
	}
}
