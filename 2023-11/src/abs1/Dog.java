package abs1;

public class Dog extends Animal {
	//������
	Dog(String name, int age) {
		super(name, age);
	}
	
	void dog() {
		System.out.println(name + "�� " + age + "�� �Դϴ�.");
	}
	
	@Override
	void bark() {
		System.out.println("�۸�");
	}
}
