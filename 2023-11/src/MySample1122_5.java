class Animal3 {
	void breath() {
		System.out.println("������");
	}
	
	public String toString() {
		return "����";
	}
}

class Lion3 extends Animal3 {
	//�������̵�
	public String toString() {
		return "����";
	}
}

class Rabbit3 extends Animal3 {
	//�������̵�
	public String toString() {
		return "�䳢";
	}
}

class Monkey3 extends Animal3 {
	//�������̵�
	public String toString() {
		return "������";
	}
	
	public void printA() {
		System.out.println("printA()....");
	}
}

class ZooKeeper {
	/*
	//�����ε�
	void feed(Lion3 lion) {
		System.out.println(lion + "���� �����ֱ�....");
	}
	
	//�����ε�
	void feed(Rabbit3 rabbit) {
		System.out.println(rabbit + "���� �����ֱ�....");
	}
	
	//�����ε�
	void feed(Monkey3 monkey) {
		System.out.println(monkey + "���� �����ֱ�....");
	}
	*/
	
	void feed(Animal3 animal) {
		System.out.println(animal + "���� �����ֱ�....");
	}
}

public class MySample1122_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		ZooKeeper j = new ZooKeeper();
		
		//�Ϲ����� ��ü ����
		Lion3 lion = new Lion3();
		j.feed(lion);
		
		Rabbit3 rabbit = new Rabbit3();
		j.feed(rabbit);
		
		Monkey3 monkey = new Monkey3();
		j.feed(monkey);
		
		
		System.out.println();
		
		//��-ĳ����
		Animal3 A1 = new Lion3();
		j.feed(A1);
		
		Animal3 A2 = new Rabbit3();
		j.feed(A2);
		
		Animal3 A3 = new Monkey3();
		j.feed(A3);
		
		j.feed(new Animal3());		//Animal2 animal = new Monkey3();
		
		
		System.out.println();
		
		//�ٿ�-ĳ����
		Lion3 lion2 = (Lion3)A1;
		j.feed(lion2);
		
		Rabbit3 rabbit2 = (Rabbit3)A2;
		j.feed(rabbit2);
		
		Monkey3 monkey2 = (Monkey3)A3;
		j.feed(monkey2);
		
		
		System.out.println();
		
		
//		monkey.printA();					//���� (monkey���������� Animal3Ŭ������ ���������̹Ƿ� Monkey()Ŭ������ �ִ� printA()�޼ҵ� ���� �Ұ���
		monkey2.printA();					//����
											//��-ĳ���� �Ұ���, �ٿ�-ĳ���� ����
	}

}
