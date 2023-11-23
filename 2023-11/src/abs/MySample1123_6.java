package abs;

abstract class Pokemon {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void attack();			//공격 메소드
	abstract void sound();			//소리 메소드
}

class Pikachu extends Pokemon {
	
	Pikachu() {
		setName("피카츄");
	}
	
	@Override
	void attack() {
		System.out.println("전기쇼크");
	}
	
	@Override
	void sound() {
		System.out.println("피카피카");
	}
}

class Squirtle extends Pokemon {
	
	Squirtle() {
		setName("꼬북이");
	}
	
	@Override
	void attack() {
		System.out.println("물대포");
	}
	
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}
}

public class MySample1123_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p1 = new Pikachu();
		System.out.println("포켓몬 이름은 " + p1.getName());
		p1.attack();
		p1.sound();
		
		Squirtle s1 = new Squirtle();
		System.out.println("포켓몬 이름은 " + s1.getName());
		s1.attack();
		s1.sound();
	}

}
