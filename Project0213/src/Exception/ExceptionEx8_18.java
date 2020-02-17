package Exception;

public class ExceptionEx8_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
	}
	
	static void method1() {
		method2();
	}

	static void method2() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method2() 예외처리");
			e.printStackTrace();
		}

	
	}
}
