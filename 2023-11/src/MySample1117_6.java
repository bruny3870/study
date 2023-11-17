/*
 문제) 부모클래스 Animal 클래스에 멤버변수는 이름, 이동수단, 울음소리, 다리수로 정의
 	  각 멤버변수를 제어하는 메소드도 포함 (set, get 메소드를 활용하여 변수값 적용)
 	  Animal 클래스를 상속받은 자식 클래스를 만들어서 각각의 이름, 이동수단, 울음소리, 다리수를 출력하는 프로그램
 단) get으로 시작하는 메소드는 해당 클래스에 인스턴스변수 값을 보내주는 것이며,
     set으로 시작하는 메소드는 해당 클래스에 인스턴스변수에 값을 저장하는 것
 	클래스는 Dog(강아지), Eagle(독수리), Lion(사자), Cat(고양이)
 	출력은 name(이름), move(이동수단), cry(울음소리), leg(다리수)
 출력 예) 강아지 이름은 해피 이고, 이동방법은 껑충껑충, 울음소리는 멍멍, 다리수는 4 입니다.
 		독수리 이름은 이글 이고, 이동방법은 펄럭펄럭, 울음소리는 구구, 다리수는 2 입니다.
 		사자 이름은 어흥 이고, 이동방법은 휙휙휙, 울음소리는 어흥어흥, 다리수는 4 입니다.
 		고양이 이름은 나비 이고, 이동방법은 껑충껑충, 울음소리는 야옹야옹, 다리수는 4 입니다.
 */

class Animal {
	String name;
	String move;
	String cry;
	int leg;
	
	Animal(String name, String move, String cry, int leg) {
		this.name = name;
		this.move = move;
		this.cry = cry;
		this.leg = leg;
	}
}

class Dog extends Animal {
	Dog(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	 void print() {
		 System.out.println("강아지 이름은 " + name + " 이고, 이동방법은 " + move + ", 울음소리는 " + cry + ", 다리수는 " + leg + " 입니다.");
	 }
}

class Eagle extends Animal {
	Eagle(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("독수리 이름은 " + name + " 이고, 이동방법은 " + move + ", 울음소리는 " + cry + ", 다리수는 " + leg + " 입니다.");
	}
}

class Lion extends Animal {
	Lion(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("사자 이름은 " + name + " 이고, 이동방법은 " + move + ", 울음소리는 " + cry + ", 다리수는 " + leg + " 입니다.");
	}
}

class Cat extends Animal {
	Cat(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
	
	void print() {
		System.out.println("고양이 이름은 " + name + " 이고, 이동방법은 " + move + ", 울음소리는 " + cry + ", 다리수는 " + leg + " 입니다.");
	}
}

public class MySample1117_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
		Dog d = new Dog("해피", "발발발발", "멍멍", 4);
		d.print();
		
		Eagle e = new Eagle("피존투", "푸드드득", "구구", 2);
		e.print();
		
		Lion l = new Lion("호랑이", "성큼성큼", "어흥", 4);
		l.print();
		
		Cat c = new Cat("나비", "우다다다", "야옹", 4);
		c.print();
	}

}
