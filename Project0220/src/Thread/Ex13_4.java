package Thread;
//쓰레드의 I/O 블락킹 예저 1
// 사용자가 입력을 마치기 전까지는 화면에 숫자 출력 X
// 사용자가 입력을 마친 후에 화면에 숫자 출력
import javax.swing.JOptionPane;

public class Ex13_4 {

	public static void main(String[] args) throws Exception {
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다. ");
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		
	}

}
