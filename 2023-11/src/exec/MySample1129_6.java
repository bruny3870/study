package exec;

public class MySample1129_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - finally ���
		try {
			startInstall();
			copyFiles();
			//deleteTempFiles();
			
		} catch (Exception e) {
			e.printStackTrace();
			//deleteTempFiles();		//���� �߻����� �ӽ������� �ֱ� ������ ��������� ��
			
		} finally {
			deleteTempFiles();		//�ڵ� �ߺ��� ���� (finally�� ���� ������� ������ ����ǹǷ� �������� �־���)
		}
		
		method1();
		
		System.out.println("method1() ���� ������ main���� ���Ʒ�");
	}
	
	static void startInstall() {
		System.out.println("���α׷� ��ġ�� �ʿ��� �غ� �۾��ϴ� ����....");
	}
	
	static void copyFiles() {
		System.out.println("���ϵ��� �����ϴ� ����....");
	}
	
	static void deleteTempFiles() {
		System.out.println("�ӽ������� �����ϴ� ����....");
	}
	
	static void method1() {
		try {
			System.out.println("method1() ���� ����");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("method1() finally ��� ����");
		}
	}

}
