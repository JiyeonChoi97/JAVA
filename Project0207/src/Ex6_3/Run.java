package Ex6_3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

		System.out.println("c1의 width와 height를 각각 50,80으로 변환합니다. ");
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}
