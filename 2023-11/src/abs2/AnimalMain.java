package abs2;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻� Ŭ���� ����
		Dog d = new Dog("����");
		Cat c = new Cat("����");
		Bird b = new Bird("����");
		
		d.print();
		System.out.println();
		c.print();
		System.out.println();
		b.print();
		System.out.println(); 
		
		c.setCry("����");
		c.print();
		
		System.out.println();
		
		b.setMove("�޷��޷� ���ƴٴѴ�");
		b.print();
		
		System.out.println();
		
		d.setFood("�߰�� ������");
		d.print();
	}

}
