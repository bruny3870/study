package exec;

public class MySample1129_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó��
		System.out.println("1");
		
		try {
			System.out.println("2");
			System.out.println(2 / 0);
			System.out.println("3");
			
		} catch (ArithmeticException e) {
			System.out.println("4");
			
			if (e instanceof ArithmeticException) {
				System.out.println("true");
			}
			
			System.out.println("ArithmeticException");
			e.printStackTrace();		//� Ŭ������ ����� ���ο� ���ϰ� �˰� ������, ������
			
			System.out.println("���� �޽��� : " + e.getMessage());		//���� �޽����� ���
			
		} catch (Exception e) {
			System.out.println("5");
			System.out.println("���� �޼��� : " + e.getMessage());
		}
		
		System.out.println("6");
	}

}
