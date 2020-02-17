package SimpleDateFormatEx;

import java.text.*;
import java.util.*;

public class Ex10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);

		Date inDate = null;

		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է¿�:2019/12/31)");

		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch(Exception e){
				System.out.println("��¥�� " + pattern + "�� ���·� �ٽ� �Է����ּ���.(�Է¿�:2019/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis()-today.getTimeInMillis())/(60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� ����� " +day+"�ð� ���̰� �ֽ��ϴ�. ");
	}
}


