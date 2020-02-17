package Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio au = new Audio();
		
		b.buy(tv);
		b.showMoney();
		b.buy(com);
		b.showMoney();
		b.buy(au);
		b.showMoney();

		b.returnProduct(com);
		b.showMoney();
		b.returnProduct(com);
		b.showMoney();
		
		b.showCart();

	}

}
