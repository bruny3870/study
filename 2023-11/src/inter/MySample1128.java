package inter;

//�������̽�
interface Animal {
	//���
	public static final int A = 10;		//public static final ���� ����
	//�߻�޼ҵ�
	public abstract void cry();			//public abstract ���� ����
}

//�������̽� ���
class Cat implements Animal {
	@Override
	public void cry() {
		System.out.println("�߿�");
	}
}

//�������̽� ���
class Dog implements Animal {
	@Override
	public void cry() {
		System.out.println("�۸�");
	}
}

public class MySample1128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
	}

}
