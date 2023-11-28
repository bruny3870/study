package inter;

//인터페이스
interface Animal {
	//상수
	public static final int A = 10;		//public static final 생략 가능
	//추상메소드
	public abstract void cry();			//public abstract 생략 가능
}

//인터페이스 상속
class Cat implements Animal {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}

//인터페이스 상속
class Dog implements Animal {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}

public class MySample1128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
	}

}
