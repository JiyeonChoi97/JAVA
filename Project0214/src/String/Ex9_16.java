package String;

public class Ex9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L;
		
		int i2 = intg + 10;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i\t="+i);
		System.out.println("intg\t="+intg);
		System.out.println("obj\t="+obj);
		System.out.println("lng\t="+lng);
		System.out.println("intg+10\t="+i2);
		System.out.println("intg+lng="+l);
		System.out.println("intg2\t="+intg2);
		System.out.println("i3\t="+i3);
		System.out.println("intg2+i3="+intg3);
	}

}
