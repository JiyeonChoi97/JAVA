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
		System.out.println("Circle�� draw()");
	}
	
	void drawCircle() {
		System.out.println("�� �����");
	}
	
	
	void drawCircle(int radius) {
		System.out.println(radius + "ũ���� �� �����");
	}
	
	
	void drawCircle(Point p, int radius) {
		System.out.println("(" + p.x + "," + p.y + ") ������" + radius + "ũ���� �� �����");
	}
}
