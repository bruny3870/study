class Parent3 {
	
}

class Child3 extends Parent3 {
	void methodA() {
		System.out.println("methodA()....");
	}
}

class Brother extends Parent3 {
	
}

public class MySample1122_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ (instanceof ������)
		
		//�Ϲ����� ��ü ����
		Parent3 p = new Parent3();
		
		System.out.println(p instanceof Object);			//true - Object ���� ����
		System.out.println(p instanceof Parent3);			//true - Parent3 ���� ����
		System.out.println(p instanceof Child3);			//false - Child3 ���� �Ұ���
		
		
		System.out.println();
		
		
		//��-ĳ����
		Parent3 p2 = new Child3();
		//�θ� ����, �ڽ� ���� -> �ڽ� ����
		//�θ� ����, �ڽ� ���� -> �θ� ����
		//�θ� ����, �ڽ� ���� -> ����
		
		System.out.println(p2 instanceof Object);			//true
		System.out.println(p2 instanceof Parent3);			//true
		System.out.println(p2 instanceof Child3);			//true
//		p2.methodA();										//���� ����, ���� �Ұ���
		
		
		System.out.println();
		
		
		//�ٿ�-ĳ����
		Child3 c = (Child3)p2;
		
		System.out.println(c instanceof Object);			//true
		System.out.println(c instanceof Parent3);			//true
		System.out.println(c instanceof Child3);			//true
		c.methodA();										//���� ����, ���� ����
	}

}
