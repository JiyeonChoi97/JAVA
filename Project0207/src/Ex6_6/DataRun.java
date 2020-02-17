package Ex6_6;

public class DataRun {

	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main():x="+d.x);
		change(d);
		System.out.println("after change():x="+d.x);
	}
	
	static void change(Data t) {
		t.x=1000;
		System.out.println("change():x="+t.x);
	}
	
}
