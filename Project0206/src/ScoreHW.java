import java.util.Scanner;

public class ScoreHW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("성적을 입력하세요 : ");
		int score = sc.nextInt();
		char grade, plus;
		int score2;

		score2 = score%10;
		if(score2>=5) plus='+';
		else plus='-';

		if(score==100) {
			grade='A';
			plus='+';
		} else if(score>=90) {
			grade='A';
		} else if(score>=80){
			grade='B';
		}  else if(score>=70){
			grade='C';
		}  else if(score>=60){
			grade='D';
		} else{
			grade='F';
		}
		System.out.println("성적은 " + grade + plus +"입니다.");

	}

}
