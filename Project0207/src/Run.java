
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		Tv tv1 = new Tv();
		

		System.out.println("���� ä���� "+ t.channel +"�Դϴ�.");
		System.out.println("���� ������ "+ t.power +"�Դϴ�.");

		t.channel = 7;
		System.out.println("���� ä���� "+ t.channel +"�Դϴ�.");
		
		t.channelDown();
		System.out.println("���� ä���� "+ t.channel +"�Դϴ�.");

		System.out.println("���� ä���� "+ tv1.channel +"�Դϴ�.");
		tv1 = t;
		System.out.println("���� ä���� "+ tv1.channel +"�Դϴ�.");
	}

}
