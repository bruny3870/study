package abs1;

public class Cat extends Animal {
	//������
	Cat(String name, int age) {
		super(name, age);
	}
	
	void cat() {
		System.out.println(name + "�� " + age + "�� �Դϴ�.");
	}
	
	@Override
	void bark() {
		System.out.println("�߿�");
	}
}
