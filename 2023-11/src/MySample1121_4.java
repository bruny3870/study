class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void methodA() {
		int x = 30;
		
		System.out.println("x : " + x);					//��������
		System.out.println("this.x : " + this.x);		//�ν��Ͻ� ����
		System.out.println("super.x : " + super.x);		//�θ� Ŭ���� �ν��Ͻ� ����
	}
}

public class MySample1121_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̵�
		Child c = new Child();
		c.methodA();
	}

}
