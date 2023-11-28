package abs1;

/*
 문제) Animal 클래스를 추상클래스로 정의하고 이름(name), 나이(age) 변수를 정의하고 생성자(매개변수 2개)를 통해 값 저장
 이동하는 매소드(move), 먹는 메소드(eat) 정의하여 이동은 "이동한다", 먹는것은 "먹는다" 로 출력
 자식 클래스에서 반드시 재정의 하도록 bark() 메소드로 짖는걸 구현
 출력 예) 이동한다
 		멍멍
 		먹는다
 		이동한다
 		야옹
 		먹는다
 */
//추상클래스
public abstract class Animal {
	String name;
	int age;
	
	//생성자
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	void move() {
		System.out.println("이동한다.");
	}
	
	//메소드
	void eat() {
		System.out.println("먹는다.");
	}
	
	//추상메소드
	abstract void bark();		//동물마다 짖는 소리는 다르므로 추상메소드로 생성
}
