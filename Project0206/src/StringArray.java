import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"kim", "Park", "yi"};
		char ch=names[1].charAt(1);
		System.out.println(ch);
		
		int i=names[1].length();
		System.out.println(i);
		
		String temp=names[1].substring(1, 3);
		System.out.println(temp);
		
		if(names[2].equals("yi"))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		char[] ch1=new char[5];
		ch1=names[0].toCharArray();
		 
		System.out.println(Arrays.toString(ch1));
		 
	}

}
