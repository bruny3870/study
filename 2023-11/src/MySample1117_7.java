class Animal2 {
	String name;
	String move;
	String cry;
	int leg;
	
	Animal2() {
		this("", "", "" , 0);
	}
	
	Animal2(String name, String move, String cry, int leg) {
//		this.name = name;
//		this.move = move;
//		this.cry = cry;
//		this.leg = leg;
		
		setName(name);
		setMove(move);
		setCry(cry);
		setLeg(leg);
	}
	
	String getName() {				//������ �ִ� �ν��Ͻ������� ������
		return this.name;
	}
	
	void setName(String name) {		//���� �޾� �־���
		this.name = name;
	}
	
	String getMove() {
		return this.move;
	}
	
	void setMove(String move) {
		this.move = move;
	}
	
	String getCry() {
		return this.cry;
	}
	
	void setCry(String cry) {
		this.cry = cry;
	}
	
	int getLeg() {
		return this.leg;
	}
	
	void setLeg(int leg) {
		this.leg = leg;
	}
}

class Dog2 extends Animal2 {
	Dog2() {
		this("", "", "", 0);	//this �������� ���� �����ڷ� super ���� �и�
	}
	
	Dog2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Eagle2 extends Animal2 {
	Eagle2() {
		this("", "", "", 0);	//this �������� ���� �����ڷ� super ���� �и�
	}
	
	Eagle2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Lion2 extends Animal2 {
	Lion2() {
		this("", "", "", 0);	//this �������� ���� �����ڷ� super ���� �и�
	}
	
	Lion2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Cat2 extends Animal2 {
	Cat2() {
		this("", "", "", 0);	//this �������� ���� �����ڷ� super ���� �и�
	}
	
	Cat2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

public class MySample1117_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2("����", "�߹߹߹�", "�۸�", 4);
		System.out.println("������ �̸��� " + d.getName() + " �̰�, �̵������ " + d.getMove() + ", �����Ҹ��� " + d.getCry() + ", �ٸ����� " + d.getLeg() +" �Դϴ�.");
		
		Eagle2 e = new Eagle2("������", "Ǫ����", "����", 2);
		System.out.println("������ �̸��� " + e.getName() + " �̰�, �̵������ " + e.getMove() + ", �����Ҹ��� " + e.getCry() + ", �ٸ����� " + e.getLeg() +" �Դϴ�.");
		
		Lion2 l = new Lion2("ȣ����", "��ŭ��ŭ", "����", 4);
		System.out.println("���� �̸��� " + l.getName() + " �̰�, �̵������ " + l.getMove() + ", �����Ҹ��� " + l.getCry() + ", �ٸ����� " + l.getLeg() +" �Դϴ�.");
		
		Cat2 c = new Cat2("����", "��ٴٴ�", "�߿�", 4);
		System.out.println("����� �̸��� " + c.getName() + " �̰�, �̵������ " + c.getMove() + ", �����Ҹ��� " + c.getCry() + ", �ٸ����� " + c.getLeg() +" �Դϴ�.");
	}

}
