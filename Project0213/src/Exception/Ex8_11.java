package Exception;

public class Ex8_11 {

	public static void main(String[] args) {

		try {
			startInstall();	// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); 	// ���ϵ��� ����
		} catch (SpaceException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�. ");
		} catch (MemoryException me) {
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
			
		} finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("��ġ���� ����");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�. "); 
		
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
