
public class MySample1116_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʱ�ȭ ���
		/*
		 ��� ��) static method : 1
		 		static block : 2
		 		static method : 3
		 		instance method : 4
		 		instance block : 5
		 		instance method : 6
		 		constructor : 7
		 		instance method : 8
		 		instance block : 9
		 		instance method : 10
		 		constructor : 11
		 */
		STest.test();	//Ŭ���� �޼ҵ�
		STest a = new STest();
		STest b = new STest();
	}

}

//Ŭ���� �ʱ�ȭ ��(�� 1�� ȣ��) -> �ν��Ͻ� �ʱ�ȭ ��� -> ������
class STest {
	static int cnt;
	//Ŭ���� �ʱ�ȭ		ù���� (1, 2)
	static {
		test();		//���� Ŭ���� �� Ŭ���� �޼ҵ�
		cnt++;
		System.out.println("static block : " + cnt);
	}
	
	//�ν��Ͻ� �ʱ�ȭ	a ���� ����° (4, 5)		b ���� �ټ���° (8, 9)
	{
		instanceMethod();	//���� Ŭ���� �� Ŭ���� �޼ҵ� or �ν��Ͻ� �޼ҵ�
		cnt++;
		System.out.println("instance block : " + cnt);
	}

	//������			�׹�° (6, 7) a ��		������° (10, 11) b ��
	STest() {
		instanceMethod();
		cnt++;
		System.out.println("constructor : " + cnt);
	}
	
	//Ŭ���� �޼ҵ�		�ι��� (3) => .test() �־Ƽ� �ѹ� �� ���
	static void test() {
		cnt++;
		System.out.println("static method : " + cnt);
	}
	
	//�ν��Ͻ� �޼ҵ�	
	void instanceMethod() {
		cnt++;
		System.out.println("instance method : " + cnt);
	}
		
}
