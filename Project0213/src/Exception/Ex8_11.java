package Exception;

public class Ex8_11 {

	public static void main(String[] args) {

		try {
			startInstall();	// 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); 	// 파일들을 복사
		} catch (SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다. ");
		} catch (MemoryException me) {
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
			
		} finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치공간 부족");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다. "); 
		
	}

	static void copyFiles() {
		
	}
	private static void deleteTempFiles() {
		// TODO Auto-generated method stub
		
	}

	private static boolean enoughSpace() {
		// TODO Auto-generated method stub
		return false;
	}
	private static boolean enoughMemory() {
		// TODO Auto-generated method stub
		return true;
	}

}
