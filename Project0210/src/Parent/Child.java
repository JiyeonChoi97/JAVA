package Parent;

public class Child extends Parent{
	
	int x = 20;
	int c = 33;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		
		System.out.println("p="+p);
		System.out.println("this.p="+this.p);
		System.out.println("super.p="+super.p);
		
		System.out.println("c="+c);
		System.out.println("this.c="+this.c);
//		System.out.println("super.c="+super.c);
	}

}
