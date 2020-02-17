package MessageFormatEx;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "Name: {0} Tel:{1} Age:{2} Birthday:{3}";
		Object[][] arguments = {
				{"±èÀÚ¹Ù", "02-123-4567", "27", "07-09"},
				{"Á¤¼ö°æ", "02-789-4567", "37", "10-26"},
				{"±è¿¹¸°", "02-786-2474", "24", "12-01"},
		};
		
		String[] result = new String[3];
		
		for(int i = 0;i<arguments.length;i++) {
			result[i]=MessageFormat.format(pattern, arguments[i]);
			System.out.println(result[i]);
			
		}
	}

}
