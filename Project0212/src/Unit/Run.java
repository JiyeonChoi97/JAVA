package Unit;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] v = new Object[10];
		
		Marine m1 = new Marine();
		Tank t = new Tank();
		Marine m2 = new Marine();
		Dropship d = new Dropship();
		
		
		m1.move(100, 100);
		m2.move(200, 200);
		t.move(300, 300);
		d.move(400, 400);

		m1.stimPack();
		m2.stimPack();

		t.changeMode();
		
		d.load();
		d.unload();
		
		m1.stop();
		m2.stop();
		t.stop();
		d.stop();
		
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[3] = new Marine();
		group[2] = new Dropship();

		for(int i = 0; i < group.length; i++) {
			group[i].move((i+1)*100, (i+3)*100);
		}
		
		for(int i = 0; i < group.length; i++) {
			group[i].stop();
		}
	}

}
