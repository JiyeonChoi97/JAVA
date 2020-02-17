package Shape;

public class Run {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		Circle c1 = new Circle();
		Point p1 = new Point(150, 150);
		Circle c2 = new Circle(p1, 50);
		
		Point[] p = {new Point(100, 100), 
					new Point(140, 50), 
					new Point(200, 100)
		};
		
		Triangle t1 = new Triangle(p);
		
		System.out.println(c1.color + c1.radius);
		System.out.println(c2.color + c2.radius);
		
		System.out.println(t1.color);
		
		//오버라이딩
		s.draw();
		c1.draw();
		c2.draw();
		t1.draw();
		// 오버로딩
		c1.drawCircle();
		c1.drawCircle(13);
		c1.drawCircle(p1, 23);

	}

}
