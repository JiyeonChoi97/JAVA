package Car;

import Tv.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		FireEngine f = new FireEngine();
		Ambulance a = new Ambulance();

		c.drive();
		f.drive();
		a.drive();
		
		f.water();
		a.siren();
		
		System.out.println("====================");
		
		Car ff = new FireEngine();
		Car aa = new Ambulance();
		
		ff.drive();
		aa.drive();
		
//		aa.water();
		
		FireEngine fff;
		Ambulance aaa;
		
//		�������迡���� ����ȯ�� �Ұ���
//		aaa = (Ambulance)fff;
//		fff = (FireEngine)aaa;
		
		System.out.println("====================");
		

		Car c1 = null;
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		f1.water();
		//��ĳ���� : �ڼտ� �ִ°��� ���󿡰� ����־�
		c1 = f1;
//		c1.water(); ���� �ȵ�
		
		// �ٿ�ĳ����
		f2 = (FireEngine)c1;
		f2.water();
		
		if(f instanceof FireEngine) {
			System.out.println("This is a FE instance");
		}
		
		if(f instanceof Car) {
			System.out.println("This is a Car instance");
			Car c3 = f;
		}
		
		if(f instanceof Object) {
			System.out.println("This is a Object instance");
		}
		
		Tv t = new Tv();
		
		if(t instanceof CaptionTv)
			System.out.println("This is a CaptionTv instance");
		
		method(t);
		method(f1);
		method(c);
		
	}

	static void method(Object obj) {
		if(obj instanceof FireEngine) {
			FireEngine fe = (FireEngine)obj;
			fe.water();
		} else if(obj instanceof Car) {
			Car c = (Car)obj;
			c.drive();
		} else {
			System.out.println("�� ����ġ");
		}
	}
	
	
	
}
