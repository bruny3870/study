package exec;

public class MySample1129_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - �޼ҵ� ����
		//��) void method() throws Exception1, Exception2, .... {
		try {
			method1();
			System.out.println("55555555");
			
		} catch (Exception e) {
			System.out.println("e.message : " + e.getMessage());
		}
		
		System.out.println("main ��");
	}
	
	static void method1() throws Exception {		//�޼ҵ� ���� ��� �� ȣ���� ������ ����
		System.out.println("11111111");
		method2();
		System.out.println("22222222");
	}
	
	static void method2() throws Exception {
		System.out.println("33333333");
		int c = 5 / 0;
		System.out.println("44444444");
	}

}
