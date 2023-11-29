package exec;

public class MySample1129_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ����) 20�� �ݺ��ؼ� �����߻��� 0 ~ 9���� �߻���Ų �� ���������� ���� ����� ȭ�鿡 ����ϵ� 0���� ������ ���� �߻�
		 	 ArithmeticException�� ���� ����ó���� �����ϰ� ���ܿ� ���� ����� 0���� ����ϰ�, 0���� ������ �߻��� ���� �Ǽ��� ���� ����ϴ� ���α׷�
		 ��� ��) 16
		 		20
		 		11
		 		0		=> �����߻� �� 0���� �Ǿ� ����ó��
		 		33
		 		100
		 		....
		 		0 �߻� �Ǽ� : 1��
		 */
		/*
		int n = 100;
		int r = 0;
		int i;
		int cnt = 0;
		
		for (i = 0; i < 20; i++) {
			try {
				r = n / (int)(Math.random() * 10);
				//System.out.println(r);
				
			} catch (ArithmeticException e) {
				//System.out.println("0");
				r = 0;
				cnt++;
				
			} finally {
				System.out.println(r);
			}
		}
		
		System.out.println("========");
		System.out.println("0 �߻� �Ǽ� : " + cnt + "��");
		*/
		
		/*
		 ����� �����ϸ�, try-catch���� ������� �ʰ� ���α׷� ����
		 */
		int n = 100;
		int r = 0;
		int i;
		int cnt = 0;
		int tmp;
		
		for (i = 0; i < 20; i++) {
			tmp = (int)(Math.random() * 10);
			
			if (tmp != 0) {
				r = n / tmp;
				
			} else {
				r = 0;
				cnt++;
			}
			
			System.out.println(r);
		}
		
		System.out.println("========");
		System.out.println("0 �߻� �Ǽ� : " + cnt + "��"); 
	}
}
