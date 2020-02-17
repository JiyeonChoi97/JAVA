package Exception;

public class SpaceException extends Exception {
		private final int ERR_CODE;
		
		public SpaceException(String msg, int errCode) {
			super(msg);
			ERR_CODE = errCode;
		}
		
		public SpaceException(String msg) {
			this(msg, 100);
		}
		
		public int getErrorCode() {
			return ERR_CODE;
		}

}
