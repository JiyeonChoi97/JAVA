
public class Test {

	public static void main(String[] args) {
		Card c= new Card();
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(cObj);
		
		Class cObj1 = Card.class;
		System.out.println(cObj1);
		
		String className = cObj.getName();
		System.out.println(className);
		
		try {
			Class cObj2 = Class.forName("Card");
			System.out.println(cObj2);
		} catch (ClassNotFoundException e) {}

		Card c2 = new Card();
		System.out.println(c2);
		
		Class cObj22 = c.getClass();
		Card c3;
		try {
			c3 = (Card)cObj22.newInstance();
			System.out.println(c3);
		} catch (InstantiationException | IllegalAccessException e) {}
		
		String className2 = Card.class.getName();
		System.out.println(className2);
	}
}
