class Parent4 {
	int x = 100;
	
	//�������̵�
	void method() {
		System.out.println("Parent4 method()....");
	}
}

class Child4 extends Parent4 {
	int x = 200;
	
	//�������̵�
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class MySample1123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ - ������������ �ν��Ͻ� ����
		Parent4 p = new Child4();
		Child4 c = new Child4();
		
		System.out.println("p.x : " + p.x);
		p.method();		//�޼ҵ� �������̵����� �ڽ� �޼ҵ� ȣ��
		
		System.out.println("c.x : " + c.x);
		c.method();
	}

}
