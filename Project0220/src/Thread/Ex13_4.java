package Thread;
//�������� I/O ���ŷ ���� 1
// ����ڰ� �Է��� ��ġ�� �������� ȭ�鿡 ���� ��� X
// ����ڰ� �Է��� ��ģ �Ŀ� ȭ�鿡 ���� ���
import javax.swing.JOptionPane;

public class Ex13_4 {

	public static void main(String[] args) throws Exception {
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�. ");
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		
	}

}
