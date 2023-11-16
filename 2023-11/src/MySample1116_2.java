class Computer {
	void show(int a) {
		System.out.println("��ǻ�� ������ : '" + a + "' �� �Դϴ�.");
	}
	
	void show(String a) {
		System.out.println("��ǰ�� : '" + a + "' �Դϴ�.");
	}
	
	void show(String a, int b) {
		System.out.println("������ ��ǰ�� '" + a + "' �̸�, '" + b + "' �� �Դϴ�.");
	}
}

public class MySample1116_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼ҵ� �����ε�
		/*
		 ������) ��ǻ�� ������ : 10000 �� �Դϴ�.
		 		��ǰ�� : ��ǻ�� �Դϴ�.
		 		������ ��ǰ�� ��ǻ�� �̸�, 10000 �� �Դϴ�.
		 */
		Computer c = new Computer();
		c.show(10000);
		c.show("��ǻ��");
		c.show("��ǻ��", 10000);
	}

}

//Ŭ���� ������ �޼ҵ�, �ν��Ͻ� ������ �޼ҵ� ����
class Member {
	int iv = 10;						//�ν��Ͻ� ����
	static int cv = 20;					//Ŭ���� ����
	
	int iv2 = iv;						//���� => �� �� �ν��Ͻ� �����̱� ������
	//static int cv2 = iv;				//�Ұ��� => iv�� �ν��Ͻ� �����̹Ƿ�
	
	//Member m = new Member();			//��ü ����
	//static int cv2 = m.iv;			//�Ұ��� => Ŭ���� ������ ��ü �����ص� �ȵ� (�޼ҵ忡�� ����)
										//Member ��ü ���� �ñ�� static ���� ���� �ñⰡ �ٸ��� ����
	
	static int cv2 = new Member().iv;	//������ �����ϰ� ����, ���� ��� ����
	
	
	static void staticMetod1() {		//Ŭ���� �޼ҵ� (��ü ������ ������� ����)
		System.out.println(cv);			//���� => ���� Ŭ���� �����̱� ������
		
		//System.out.println(iv);		//�Ұ��� => �ν��Ͻ� ������ Ŭ���� �޼ҵ忡 ���� �ȵ� (���� �ñ� ����)
		Member m = new Member();		//��ü ����
		System.out.println(m.iv);		//��ü ���� �� �ν��Ͻ� ���� ��� ����
	}
	
	void instanceMetod1() {				//�ν��Ͻ� �޼ҵ�
		System.out.println(cv);			
		System.out.println(iv);			//�ν��Ͻ� ����, Ŭ���� ���� �� �� ��� ����
	}
	
	static void staticMetod2() {		//Ŭ���� �޼ҵ�
		staticMetod1();					//���� Ŭ���� �޼ҵ� ȣ�� ����
		
		//instanceMetod1();				//�ν��Ͻ� �޼ҵ�� ȣ�� �Ұ���
		Member m = new Member();		//��ü ����
		m.instanceMetod1();				//��ü ���� �� �ν��Ͻ� �޼ҵ� ȣ�� ����
	}
	
	void instanceMetod2() {				//�ν��Ͻ� �޼ҵ�
		staticMetod1();
		instanceMetod1();				//�ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� �� �� ȣ�� ����
	}
	
}

