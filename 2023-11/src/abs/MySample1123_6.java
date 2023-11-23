package abs;

abstract class Pokemon {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void attack();			//���� �޼ҵ�
	abstract void sound();			//�Ҹ� �޼ҵ�
}

class Pikachu extends Pokemon {
	
	Pikachu() {
		setName("��ī��");
	}
	
	@Override
	void attack() {
		System.out.println("�����ũ");
	}
	
	@Override
	void sound() {
		System.out.println("��ī��ī");
	}
}

class Squirtle extends Pokemon {
	
	Squirtle() {
		setName("������");
	}
	
	@Override
	void attack() {
		System.out.println("������");
	}
	
	@Override
	void sound() {
		System.out.println("���ϲ���");
	}
}

public class MySample1123_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p1 = new Pikachu();
		System.out.println("���ϸ� �̸��� " + p1.getName());
		p1.attack();
		p1.sound();
		
		Squirtle s1 = new Squirtle();
		System.out.println("���ϸ� �̸��� " + s1.getName());
		s1.attack();
		s1.sound();
	}

}
