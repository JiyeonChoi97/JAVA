package Ex6_11;

public class Data {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data1 d4 = new Data1(10);
		Data2 d2 = new Data2();
		Data2 d3 = new Data2(10);
		
		System.out.println(d1.value);
		System.out.println(d2.value);
		System.out.println(d3.value);
		System.out.println(d4.value);
	}
}
