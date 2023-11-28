package abs1;

public class Cat extends Animal {
	//생성자
	Cat(String name, int age) {
		super(name, age);
	}
	
	void cat() {
		System.out.println(name + "는 " + age + "살 입니다.");
	}
	
	@Override
	void bark() {
		System.out.println("야옹");
	}
}
