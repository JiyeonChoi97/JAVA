import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[] {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<100; i++) {
			int n = (int)(Math.random()*10);
			int temp=num[0];
			num[0]=num[n];
			num[n]=temp;
		}
		
		System.out.println(Arrays.toString(num));

	}

}
