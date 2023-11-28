package inter;

//인터페이스
interface Gamer {
	//상수
	public static final int GAME_MAX_LEVEL = 100;
	
	//추상메소드
	public abstract void doGame();
}

//인터페이스
interface Singer {
	//상수
	int AUDITON_MAX_CHANCE = 10;		//public static final 생략
	int GAME_MAX_LEVEL = 99;			//public static final 생략
	
	//추상메소드
	void singSong();					//public abstract 생략
}

class Student implements Gamer, Singer {
	String name;
	int score;
	
	//생성자
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public void doGame() {
		System.out.println(name + "은(는) 게임을 합니다.");
	}
	
	@Override
	public void singSong() {
		System.out.println(name + "은(는) 노래를 부릅니다.");
	}
}

public class MySample1128_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 다중 상속
		Student s = new Student("고길동", 83);
		
		System.out.println("게임의 최고 레벨(Gamer) : " + Gamer.GAME_MAX_LEVEL);
		System.out.println("가수의 최고 레벨(Singer) : " + Singer.GAME_MAX_LEVEL);
		
		s.doGame();
		System.out.println(s.name + "의 점수 : " + s.score);
		System.out.println("오디션 최대 기회 : " + Singer.AUDITON_MAX_CHANCE);
	}

}
