package exec;

public class MySample1129_4 extends Exception {
	MySample1129_4(String a) {
		super(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - ���ܹ߻�
		try {
			//Exception e = new Exception("�Ϻη� ���� �߻���Ŵ");		//���� �޼��� ���� ����
			MySample1129_4 e = new MySample1129_4("�Ϻη� ���� �߻���Ŵ");
			throw e;
			
		} catch (Exception e) {
			System.out.println("���� �޼��� : " + e.getMessage());
		}
		
		System.out.println("���α׷� ���� ���� �Ǿ���");
	}

}
