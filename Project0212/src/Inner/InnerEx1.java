package Inner;

public class InnerEx1 {

	class InstanceInner{
		int i_iv = 100;
//		static int i_cv = 100;
		final static int I_CONST = 100;
	}
	
	static class StaticInner{
		int s_iv = 201;
		static int s_cv = 202;
		final static int S_CONST = 203;
	}
	
	void myMethod() {
		class LocalInner{
			int l_iv = 301;
//			static int l_cv = 302;
			final static int L_CONST = 303;
		}
		LocalInner l = new LocalInner();
		System.out.println("myMethod():l_iv="+l.l_iv);
		System.out.println("myMethod():L_CONST="+l.L_CONST);
	}
	
}
