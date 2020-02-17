package Exception;

public class MyException extends Exception{
	private final int ERR_CODE;
	
	public MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	public MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}

}
