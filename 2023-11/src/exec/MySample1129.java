package exec;

public class MySample1129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó��
		int[] a = {2, 0};
		int b = 4;
		
		//int c = a[2];		//���� ���� �� ���� �߻� Ȯ��
		
		try {
			//int c = a[2];
			int c = b / a[1];
			System.out.println("c : " + c);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ���� �߻�");
			
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ� : " + e);
			
		} catch (Exception e) {
			System.out.println("���� ���� ���� �߻� : " + e);
			
		} finally {
			System.out.println("������ �����");
		}
		
		System.out.println("try-catch ��");
	}

}
