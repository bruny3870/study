package abs;

abstract class Animal {
	int num;
	
	void numChk() {
		System.out.println("num : " + num);
	}
	
	abstract void cry();		//�߻� �޼ҵ�
	
}

class Cat extends Animal {		//�θ� Ŭ������ �߻� �޼ҵ尡 �����Ƿ� �ݵ�� �ڽ� Ŭ������ �߻� �޼ҵ带 �������̵� �ؾߵ�
	
	@Override
	void cry() {
		System.out.println("�ֿ�");
	}
}

class Dog extends Animal {		//�θ� Ŭ������ �߻� �޼ҵ尡 �����Ƿ� �ݵ�� �ڽ� Ŭ������ �߻� �޼ҵ带 �������̵� �ؾߵ�
	
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class MySample1123_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻� Ŭ����
//		Animal a = new Animal();		//�߻� Ŭ������ �ν��Ͻ��� ������ �� ����. (��ü ���� �Ұ�)
		Animal c = new Cat();			//Cat c = new Cat();
		Animal d = new Dog();			//Dog d = new Dog();
		
		c.cry();
		d.cry();
	}

}
