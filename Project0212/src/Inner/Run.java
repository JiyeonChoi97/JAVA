package Inner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(InnerEx1.InstanceInner.I_CONST);
//		System.out.println(InnerEx1.InstanceInner.iv);
		System.out.println(InnerEx1.StaticInner.S_CONST);
		System.out.println(InnerEx1.StaticInner.s_cv);
		
		InnerEx1 e = new InnerEx1();
		InnerEx1.InstanceInner ie = e.new InstanceInner();
		
		System.out.println("ie.iv"+ie.i_iv);
		e.myMethod();
		
	}

}
