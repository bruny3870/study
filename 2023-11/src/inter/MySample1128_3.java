package inter;

/*
 문제) 인터페이스 Animal2 와 Pet 을 정의하며, Animal2 클래스는 울음소리(cry), Pet 클래스는 움직임(play)를 정의
 	  고양이2 클래스와 강아지2 클래스에서 울음소리와 움직임에 대한 재정의를 구현
 단) 고양이 울음소리 "야옹야옹", 움직임 "폴짝폴짝 뛰어다니기"
     강아지 울음소리 "멍멍", 움직임 "산책하기"
 */

//인터페이스
interface Animal2 {
	//추상메소드
	public abstract void cry();
}

//인터페이스
interface Pet {
	//추상메소드
	public abstract void play();
}

class Cat2 implements Animal2, Pet {
	@Override
	public void cry() {
		System.out.println("야옹야옹");
	}
	
	@Override
	public void play() {
		System.out.println("폴짝폴짝 뛰어다니기");
	}
}

class Dog2 implements Animal2, Pet {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	@Override
	public void play() {
		System.out.println("산책하기");
	}
}

public class MySample1128_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 다중 상속 (implements A, B)
		Cat2 c2 = new Cat2();
		Dog2 d2 = new Dog2();
		
		c2.cry();
		c2.play();
		
		d2.cry();
		d2.play();
	}

}
