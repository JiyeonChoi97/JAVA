package String;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbccAABBCCaa";
		System.out.println(str);
		StringCount sc = new StringCount(str);
//		int i = sc.StringCount("aa");
		System.out.println("aa�� " + sc.StringCount("aa") + "�� ã����.");
	}

}
