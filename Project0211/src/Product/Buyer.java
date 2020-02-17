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
			System.out.println("�ܾ� ����, �� �� �����");
			return;
		}
		if(p instanceof Audio) {
			System.out.println("Audio ����");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		} else if(p instanceof Computer) {
			System.out.println("Computer ����");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		} else if(p instanceof Tv) {
			System.out.println("Tv ����");
			money -= p.price;
			bonusPoint += p.bonusPoint;
		}
		//		cart[i++]=p;
		cart.add(p);
	}

	void returnProduct(Object obj) {
		if(cart.isEmpty()) {
			System.out.println("��ǰ�� ��ǰ�� �����ϴ�. ");
			return;
		}
		
		Product p = (Product)obj;
		for(int i = 0; i<cart.size();i++) {
			String s = (cart.get(i)).toString();
			if(s.equals(p.toString())) {
				money += p.price;
				bonusPoint -= p.bonusPoint;
				System.out.println(p.toString() + " ��ǰ");
				cart.remove(p);
				return;
			}
		}
		System.out.println("���� ���� ����");

	}

	void showMoney(){
		System.out.println("������ : " + money + ", ����Ʈ :  " + bonusPoint);
	}

	void showCart() {
		//		for(int i = 0 ; i < cart.length; i++) {
		//			Product pc = cart[i];
		//			if(pc == null) break;
		//			System.out.println(pc.toString());

		System.out.println("============================\n<�� ���� ����>\n============================");
		int sum=0;
		String cartList=" ";
		if(cart.isEmpty()) {
			System.out.println("������ ������ �����ϴ�. ");
			return;
		}
		for(int i = 0;i<cart.size();i++) {
			Product pc = (Product)cart.get(i);
			sum += pc.price;
			cartList += (i==0)? ""+pc.toString() : ", " + pc.toString();			
		}
		System.out.println("�ѱ��� �ݾ��� " + sum + "�Դϴ�.");
		System.out.println("���� �ݾ��� " + money + "�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ : " + cartList);
	}


}
