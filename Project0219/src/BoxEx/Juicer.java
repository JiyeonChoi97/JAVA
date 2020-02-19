package BoxEx;

public class Juicer {

	static Juice makeJuice(FruitBox2 <? extends Fruit2> box) {
		String tmp = "";
		
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		
		return new Juice(tmp);
	}
}
