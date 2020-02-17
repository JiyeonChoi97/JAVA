
public class Array {

	public static void main(String[] args) {


		int[] score = new int[5];
		
		score[0]=100;
		score[1]=200;
		score[2]=300;
		score[3]=400;
		score[4]=500;
		
		int[] test = new int[] {100,90,80,70,60};
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
			
			for(int i=0;i<test.length;i++) {
				System.out.println(test[i]);
			}

	}

}
