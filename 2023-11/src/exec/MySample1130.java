package exec;

public class MySample1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó��
		try {
			System.out.println("�ܺ� try");
			
			try {
				System.out.println("���� try");
				Exception e = new Exception();
				throw e;
				
			} catch (Exception e) {
				System.out.println("���� try-catch exception : " + e);
				System.out.println("���� ������ �ѹ� ��");
				throw e;
			}
			
		} catch (Exception e) {
			System.out.println("�ܺ� try-catch exception : " + e);
		}
		
		System.out.println("����ó�� ��");
	}

}
