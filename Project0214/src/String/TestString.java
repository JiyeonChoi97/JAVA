package String;

public class TestString {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1==str2);
		
		System.out.println("++++++++++++++++++++++++++");

		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);									// ���������� �ּ� ��
		System.out.println(str3.toString()==str4.toString());			// �����������, �񱳿����ڷ� �� �ȵ�
		System.out.println(str3.toString().equals(str4.toString()));	// ���� ��
		System.out.println("++++++++++++++++++++++++++");
		
		String a = "";
//		char c = '';	// (X) 
		char d = ' ';
		
		char[] cARR = new char[0];
		int[] iArr = {};
	}

}
