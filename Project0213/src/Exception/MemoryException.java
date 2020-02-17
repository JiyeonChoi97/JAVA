package Exception;

public class MemoryException extends Exception {
	private final int ERR_CODE;
	
	public MemoryException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	public MemoryException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
}
