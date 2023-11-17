class Animal2 {
	String name;
	String move;
	String cry;
	int leg;
	
	Animal2() {
		this("", "", "" , 0);
	}
	
	Animal2(String name, String move, String cry, int leg) {
//		this.name = name;
//		this.move = move;
//		this.cry = cry;
//		this.leg = leg;
		
		setName(name);
		setMove(move);
		setCry(cry);
		setLeg(leg);
	}
	
	String getName() {				//가지고 있는 인스턴스변수를 던져줌
		return this.name;
	}
	
	void setName(String name) {		//값을 받아 넣어줌
		this.name = name;
	}
	
	String getMove() {
		return this.move;
	}
	
	void setMove(String move) {
		this.move = move;
	}
	
	String getCry() {
		return this.cry;
	}
	
	void setCry(String cry) {
		this.cry = cry;
	}
	
	int getLeg() {
		return this.leg;
	}
	
	void setLeg(int leg) {
		this.leg = leg;
	}
}

class Dog2 extends Animal2 {
	Dog2() {
		this("", "", "", 0);	//this 선언으로 다음 생성자로 super 순서 밀림
	}
	
	Dog2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Eagle2 extends Animal2 {
	Eagle2() {
		this("", "", "", 0);	//this 선언으로 다음 생성자로 super 순서 밀림
	}
	
	Eagle2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Lion2 extends Animal2 {
	Lion2() {
		this("", "", "", 0);	//this 선언으로 다음 생성자로 super 순서 밀림
	}
	
	Lion2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

class Cat2 extends Animal2 {
	Cat2() {
		this("", "", "", 0);	//this 선언으로 다음 생성자로 super 순서 밀림
	}
	
	Cat2(String name, String move, String cry, int leg) {
		super(name, move, cry, leg);
	}
}

public class MySample1117_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d = new Dog2("해피", "발발발발", "멍멍", 4);
		System.out.println("강아지 이름은 " + d.getName() + " 이고, 이동방법은 " + d.getMove() + ", 울음소리는 " + d.getCry() + ", 다리수는 " + d.getLeg() +" 입니다.");
		
		Eagle2 e = new Eagle2("피존투", "푸드드득", "구구", 2);
		System.out.println("독수리 이름은 " + e.getName() + " 이고, 이동방법은 " + e.getMove() + ", 울음소리는 " + e.getCry() + ", 다리수는 " + e.getLeg() +" 입니다.");
		
		Lion2 l = new Lion2("호랑이", "성큼성큼", "어흥", 4);
		System.out.println("사자 이름은 " + l.getName() + " 이고, 이동방법은 " + l.getMove() + ", 울음소리는 " + l.getCry() + ", 다리수는 " + l.getLeg() +" 입니다.");
		
		Cat2 c = new Cat2("나비", "우다다다", "야옹", 4);
		System.out.println("고양이 이름은 " + c.getName() + " 이고, 이동방법은 " + c.getMove() + ", 울음소리는 " + c.getCry() + ", 다리수는 " + c.getLeg() +" 입니다.");
	}

}
