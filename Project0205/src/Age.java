import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("태어난 연도를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int age = 2020 - year +1;
		
		System.out.println("당신의 나이는 " + age + "살 입니다.");
	}

}
