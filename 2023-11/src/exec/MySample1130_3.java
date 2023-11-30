package exec;

public class MySample1130_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - ����� ����ó��
		try {
			install();
			
		} catch(InstallException e) {
			System.out.println("11111111");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println("22222222");
			e.printStackTrace();
			
		} finally {
			System.out.println("33333333");
		}
	}
	
	//��ġ ����
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
			
		} catch(SpaceException e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻� 1111");
			//InstallException�� ���� ���� SpaceException���� ����
			ie.initCause(e);		//������ ���ܸ� ���ܷ� ���
			throw ie;
			
		} catch(MemoryException e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻� 2222");
			ie.initCause(e);
			throw ie;
			
		} finally {
			deleteTempFiles();
		}
		
	}
	
	//�������, �޸� ���� ����
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("������� ����");
		}
		
		if (!enoughMemory()) {
			throw new MemoryException("�޸� ����");
		}
	}
	
	static void copyFiles() {
		System.out.println("��ġ�� �ʿ��� ���ϵ��� ����");
	}
	
	static boolean enoughSpace() {
		System.out.println("��ġ�� �ʿ��� ������� Ȯ��");
		return false;
	}
	
	static boolean enoughMemory() {
		System.out.println("��ġ�� �ʿ��� �޸� Ȯ��");
		return true;
	}
	
	static void deleteTempFiles() {
		System.out.println("��ġ �� �ӽ����� ����");
	}

}

//��ġ ����
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

//������� ����
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

//�޸� ����
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
