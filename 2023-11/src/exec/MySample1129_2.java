package exec;

public class MySample1129_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó��
		//0���� ���������� "0���� ���� �� �����ϴ�" �޼��� ��� �� ��� ����
		
		int number = 10;
		int result = 0;
		int i;
		
		for (i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);		//0 ~ 9���� ��
				System.out.println(" result : " + result);
				
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ� : " + e);
			}
		}
		
		
		//�������
//		System.out.println("1");
//		
//		try {
//			System.out.println("2");
//			
//			int a = 5 / 0;		//�����߻�
//			
//			System.out.println("3");	//������
//			
//		} catch (Exception e) {
//			System.out.println("4");
//			
//		} finally {
//			System.out.println("4-2");
//		}
//		
//		System.out.println("5");
	}

}
