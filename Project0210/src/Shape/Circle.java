package Shape;

public class Circle extends Shape {
	Point center;
	int radius;
	
	Circle(){
		this(new Point(0,0), 100);
	}

	Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	void draw() {
		System.out.println("Circle의 draw()");
	}
	
	void drawCircle() {
		System.out.println("원 만들기");
	}
	
	
	void drawCircle(int radius) {
		System.out.println(radius + "크기의 원 만들기");
	}
	
	
	void drawCircle(Point p, int radius) {
		System.out.println("(" + p.x + "," + p.y + ") 반지름" + radius + "크기의 원 만들기");
	}
}
