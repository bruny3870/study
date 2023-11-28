package abs1;

public class Dog extends Animal {
	//积己磊
	Dog(String name, int age) {
		super(name, age);
	}
	
	void dog() {
		System.out.println(name + "篮 " + age + "混 涝聪促.");
	}
	
	@Override
	void bark() {
		System.out.println("港港");
	}
}
