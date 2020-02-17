
public class Car {

	String color;
	String gear;
	int door;
	
	static int number;
	
	Car() {
	}
	
	Car(String color, String gear, int door){
		this.color = color;
		this.gear = gear;
		this.door = door;		
	}
	{
		color = "Black";
		gear = "stick";
		door = 3;
	}
	static {
		number = 100;
	}
}
