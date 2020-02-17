
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		Tv tv1 = new Tv();
		

		System.out.println("현재 채널은 "+ t.channel +"입니다.");
		System.out.println("현재 전원은 "+ t.power +"입니다.");

		t.channel = 7;
		System.out.println("현재 채널은 "+ t.channel +"입니다.");
		
		t.channelDown();
		System.out.println("현재 채널은 "+ t.channel +"입니다.");

		System.out.println("현재 채널은 "+ tv1.channel +"입니다.");
		tv1 = t;
		System.out.println("현재 채널은 "+ tv1.channel +"입니다.");
	}

}
