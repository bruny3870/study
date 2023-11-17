/*
 ����) �θ�Ŭ���� Animal Ŭ������ ��������� �̸�, �̵�����, �����Ҹ�, �ٸ����� ����
 	  �� ��������� �����ϴ� �޼ҵ嵵 ���� (set, get �޼ҵ带 Ȱ���Ͽ� ������ ����)
 	  Animal Ŭ������ ��ӹ��� �ڽ� Ŭ������ ���� ������ �̸�, �̵�����, �����Ҹ�, �ٸ����� ����ϴ� ���α׷�
 ��) get���� �����ϴ� �޼ҵ�� �ش� Ŭ������ �ν��Ͻ����� ���� �����ִ� ���̸�,
     set���� �����ϴ� �޼ҵ�� �ش� Ŭ������ �ν��Ͻ������� ���� �����ϴ� ��
 	Ŭ������ Dog(������), Eagle(������), Lion(����), Cat(�����)
 	����� name(�̸�), move(�̵�����), cry(�����Ҹ�), leg(�ٸ���)
 ��� ��) ������ �̸��� ���� �̰�, �̵������ ���沱��, �����Ҹ��� �۸�, �ٸ����� 4 �Դϴ�.
 		������ �̸��� �̱� �̰�, �̵������ �޷��޷�, �����Ҹ��� ����, �ٸ����� 2 �Դϴ�.
 		���� �̸��� ���� �̰�, �̵������ ������, �����Ҹ��� �������, �ٸ����� 4 �Դϴ�.
 		����� �̸��� ���� �̰�, �̵������ ���沱��, �����Ҹ��� �߿˾߿�, �ٸ����� 4 �Դϴ�.
 */

class Animal {
	String name;
	String move;
	String cry;
	int leg;
	
	Animal(String name, String move, String cry, int leg) {
		this.name = name;
		this.move = move;
		this.cry = cry;
		this.leg = leg;
	}
}

class Dog extends Animal {
	Dog(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	 void print() {
		 System.out.println("������ �̸��� " + name + " �̰�, �̵������ " + move + ", �����Ҹ��� " + cry + ", �ٸ����� " + leg + " �Դϴ�.");
	 }
}

class Eagle extends Animal {
	Eagle(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("������ �̸��� " + name + " �̰�, �̵������ " + move + ", �����Ҹ��� " + cry + ", �ٸ����� " + leg + " �Դϴ�.");
	}
}

class Lion extends Animal {
	Lion(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("���� �̸��� " + name + " �̰�, �̵������ " + move + ", �����Ҹ��� " + cry + ", �ٸ����� " + leg + " �Դϴ�.");
	}
}

class Cat extends Animal {
	Cat(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("����� �̸��� " + name + " �̰�, �̵������ " + move + ", �����Ҹ��� " + cry + ", �ٸ����� " + leg + " �Դϴ�.");
	}
}

public class MySample1117_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		Dog d = new Dog("����", "�߹߹߹�", "�۸�", 4);
		d.print();
		
		Eagle e = new Eagle("������", "Ǫ����", "����", 2);
		e.print();
		
		Lion l = new Lion("ȣ����", "��ŭ��ŭ", "����", 4);
		l.print();
		
		Cat c = new Cat("����", "��ٴٴ�", "�߿�", 4);
		c.print();
	}

}
