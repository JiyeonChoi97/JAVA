package Tv;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		
		System.out.println(t.power);
		t.channelUp();
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		
		System.out.println(ct.power);
		ct.channelUp();
		System.out.println(ct.channel);
		ct.channelDown();
		System.out.println(ct.channel);
		ct.cation();
		
		Tv tt = new CaptionTv();
		tt.power();
		System.out.println(tt.power);
		tt.channelUp();
		System.out.println(tt.channel);
		tt.channelDown();
		System.out.println(tt.channel);
//		tt.cation();
//		System.out.println(tt.text);
		
		
//		CaptionTv cctt = new Tv();
		
		
		
	}

}
