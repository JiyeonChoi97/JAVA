package Clone;

public class Run {

	public static void main(String[] args) {

		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();
		System.out.println(original + " : " + copy);
		
		Circle originalC = new Circle(copy, 10);
		Circle copyC = (Circle)originalC.clone();
		System.out.println(originalC + " : " + copyC);
	}

}
