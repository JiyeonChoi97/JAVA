import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {0,1,2,3,4};
		int[][] arr2D= {{11,12}, {21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D=new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2=new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = Arrays.copyOfRange(arr,2,4);
		System.out.println(Arrays.toString(arr5));
		int[] arr6 = Arrays.copyOfRange(arr,0,7);
		System.out.println(Arrays.toString(arr6));
		
		int[] arrSort= {6,2,0,1,4};
		System.out.println(Arrays.toString(arrSort));
		Arrays.sort(arrSort);
		System.out.println(Arrays.toString(arrSort));
	}

}
