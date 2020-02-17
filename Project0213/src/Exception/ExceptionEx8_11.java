package Exception;

public class ExceptionEx8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);

			System.out.println(0/0);

			System.out.println(4);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외메시지 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception");
			System.out.println(5);
		}
		
		System.out.println(6);

	}

}
