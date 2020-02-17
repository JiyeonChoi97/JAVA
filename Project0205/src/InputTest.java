import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력하세요.");
		int num = sc.nextInt();
		
		System.out.printf("입력하신 숫자는 %d입니다.",num);
	}

}
