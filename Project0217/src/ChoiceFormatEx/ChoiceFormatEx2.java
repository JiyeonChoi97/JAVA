package ChoiceFormatEx;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "60#D|65#D+|70#C|75#C+|80#B|85#B+|90#A|95#A+";
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		int[] scores = {100,95,88,70,52,60,70,65,59,12,0,99};
		
		for(int i = 0;i<scores.length;i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}

	}

}
