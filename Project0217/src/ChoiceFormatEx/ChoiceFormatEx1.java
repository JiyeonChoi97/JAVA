package ChoiceFormatEx;
import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] limits = {60,65, 70, 75,80, 85,90, 95};
		String[] grades = {"D","D+", "C","C+", "B","B+", "A", "A+"};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		int[] scores= {100,95,88,70,52,60,70};
		
		for(int i = 0;i<scores.length;i++) {
			System.out.println(scores[i] + ":" + form.format(scores[i]));
		}
		
	}

}
