package abs1;

/*
 ����) Animal Ŭ������ �߻�Ŭ������ �����ϰ� �̸�(name), ����(age) ������ �����ϰ� ������(�Ű����� 2��)�� ���� �� ����
 �̵��ϴ� �żҵ�(move), �Դ� �޼ҵ�(eat) �����Ͽ� �̵��� "�̵��Ѵ�", �Դ°��� "�Դ´�" �� ���
 �ڽ� Ŭ�������� �ݵ�� ������ �ϵ��� bark() �޼ҵ�� ¢�°� ����
 ��� ��) �̵��Ѵ�
 		�۸�
 		�Դ´�
 		�̵��Ѵ�
 		�߿�
 		�Դ´�
 */
//�߻�Ŭ����
public abstract class Animal {
	String name;
	int age;
	
	//������
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//�޼ҵ�
	void move() {
		System.out.println("�̵��Ѵ�.");
	}
	
	//�޼ҵ�
	void eat() {
		System.out.println("�Դ´�.");
	}
	
	//�߻�޼ҵ�
	abstract void bark();		//�������� ¢�� �Ҹ��� �ٸ��Ƿ� �߻�޼ҵ�� ����
}
