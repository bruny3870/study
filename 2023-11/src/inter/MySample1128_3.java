package inter;

/*
 ����) �������̽� Animal2 �� Pet �� �����ϸ�, Animal2 Ŭ������ �����Ҹ�(cry), Pet Ŭ������ ������(play)�� ����
 	  �����2 Ŭ������ ������2 Ŭ�������� �����Ҹ��� �����ӿ� ���� �����Ǹ� ����
 ��) ����� �����Ҹ� "�߿˾߿�", ������ "��¦��¦ �پ�ٴϱ�"
     ������ �����Ҹ� "�۸�", ������ "��å�ϱ�"
 */

//�������̽�
interface Animal2 {
	//�߻�޼ҵ�
	public abstract void cry();
}

//�������̽�
interface Pet {
	//�߻�޼ҵ�
	public abstract void play();
}

class Cat2 implements Animal2, Pet {
	@Override
	public void cry() {
		System.out.println("�߿˾߿�");
	}
	
	@Override
	public void play() {
		System.out.println("��¦��¦ �پ�ٴϱ�");
	}
}

class Dog2 implements Animal2, Pet {
	@Override
	public void cry() {
		System.out.println("�۸�");
	}
	
	@Override
	public void play() {
		System.out.println("��å�ϱ�");
	}
}

public class MySample1128_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� ���� ��� (implements A, B)
		Cat2 c2 = new Cat2();
		Dog2 d2 = new Dog2();
		
		c2.cry();
		c2.play();
		
		d2.cry();
		d2.play();
	}

}
