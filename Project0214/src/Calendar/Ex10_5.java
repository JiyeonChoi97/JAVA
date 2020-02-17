package Calendar;

import java.util.*;

public class Ex10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); // ������
		Calendar eDay = Calendar.getInstance(); // ����
		
		// ���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
		// ���� ���, 2019�� 11�� 1���� sDay.set(2019, 10, 1);�� ���� ����� �Ѵ�.
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		// �������� ù��(12�� 1��)���� �Ϸ縦 ���� ���ڴ��� ������ �� (11�� 30��)�� �ȴ�. 
		eDay.add(Calendar.DATE, -1);
		
		// ù��° ������ ���� �������� �˾Ƴ���. 
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// eDay�� ������ ��¥�� ���´�. 
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("\t"+args[0]+"�� "+args[1]+"��" );
		System.out.println(" SU MO TU WE TH FR SA");
		
		// �ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�. 
		// ���� 1���� �������̶�� ������ ���� ��´�. (�Ͽ��Ϻ��� ����)
		for(int i = 0; i< START_DAY_OF_WEEK; i++) {
			System.out.println("\t");
		}
		
		for(int i = 1, n=START_DAY_OF_WEEK; i<=END_DAY;i++, n++) {
			System.out.println((i<10)? "\t"+i : " "+i);
			if(n%7==0) System.out.println();
		}
		 

	}

}
