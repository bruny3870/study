class A {
	void methodA() {
		System.out.println("methodA()....");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB()....");
	}
}

public class MySample1122_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		A obj = new B();
		
		obj.methodA();		//����
//		obj.methodB();		//�Ұ��� �ڽ��� �θ� ���� �� �� ����
		
		B obj2 = new B();
		obj2.methodA();		//����
		obj2.methodB();		//����
	}

}
