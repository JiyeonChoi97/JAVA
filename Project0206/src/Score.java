import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		
		int score = sc.nextInt();
//		int sum=1;
		
		while(score>0)
			System.out.println(score--);
				
		System.out.println("while�� ����");
	}

}
