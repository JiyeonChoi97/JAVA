package IUnit;

public class Run {

	public static void main(String[] args) {

		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		tank.hitPoint = 130;
		marine.hitPoint = 35;
		
		scv.repair(tank);
		scv.repair(marine);
	}

}
