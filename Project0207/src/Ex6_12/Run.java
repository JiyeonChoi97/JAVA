package Ex6_12;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.color = "yellow";
		car1.gearType = "auto";
		car1.door = 3;
		
		System.out.println(car1.color);
		System.out.println(car1.gearType);
		System.out.println(car1.door);
		
		Car car2 = new Car("white", "auto", 5);
		
		System.out.println(car2.color);
		System.out.println(car2.gearType);
		System.out.println(car2.door);
	}

}
