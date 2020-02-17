package Product;

import java.util.Vector;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;
	//	int i = 0;
	//	Product[] cart = new Product[10];
	Vector cart = new Vector();


	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액 부족, 살 수 없어요");
			return;
		}
		if(p instanceof Audio) {
			System.out.println("Audio 구매");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		} else if(p instanceof Computer) {
			System.out.println("Computer 구매");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		} else if(p instanceof Tv) {
			System.out.println("Tv 구매");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		}
		//		cart[i++]=p;
		cart.add(p);
	}

	void returnProduct(Object obj) {
		if(cart.isEmpty()) {
			System.out.println("반품할 물품이 없습니다. ");
			return;
		}
		
		Product p = (Product)obj;
		for(int i = 0; i<cart.size();i++) {
			String s = (cart.get(i)).toString();
			if(s.equals(p.toString())) {
				money += p.price;
				bonusPoint -= p.bonusPoint;
				System.out.println(p.toString() + " 반품");
				cart.remove(p);
				return;
			}
		}
		System.out.println("구매 내역 없음");

	}

	void showMoney(){
		System.out.println("남은돈 : " + money + ", 포인트 :  " + bonusPoint);
	}

	void showCart() {
		//		for(int i = 0 ; i < cart.length; i++) {
		//			Product pc = cart[i];
		//			if(pc == null) break;
		//			System.out.println(pc.toString());

		System.out.println("============================\n<총 구매 정리>\n============================");
		int sum=0;
		String cartList=" ";
		if(cart.isEmpty()) {
			System.out.println("구매한 내역이 없습니다. ");
			return;
		}
		for(int i = 0;i<cart.size();i++) {
			Product pc = (Product)cart.get(i);
			sum += pc.price;
			cartList += (i==0)? ""+pc.toString() : ", " + pc.toString();			
		}
		System.out.println("총구매 금액은 " + sum + "입니다.");
		System.out.println("남은 금액은 " + money + "입니다.");
		System.out.println("구입하신 물품 : " + cartList);
	}


}
