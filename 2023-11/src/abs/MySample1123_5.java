package abs;

abstract class Animal {
	int num;
	
	void numChk() {
		System.out.println("num : " + num);
	}
	
	abstract void cry();		//추상 메소드
	
}

class Cat extends Animal {		//부모 클래스에 추상 메소드가 있으므로 반드시 자식 클래스에 추상 메소드를 오버라이딩 해야됨
	
	@Override
	void cry() {
		System.out.println("애옹");
	}
}

class Dog extends Animal {		//부모 클래스에 추상 메소드가 있으므로 반드시 자식 클래스에 추상 메소드를 오버라이딩 해야됨
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MySample1123_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스
//		Animal a = new Animal();		//추상 클래스는 인스턴스를 생성할 수 없음. (객체 생성 불가)
		Animal c = new Cat();			//Cat c = new Cat();
		Animal d = new Dog();			//Dog d = new Dog();
		
		c.cry();
		d.cry();
	}

}
