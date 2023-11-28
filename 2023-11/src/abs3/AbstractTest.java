package abs3;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스 메인
		HighStudent hs = new HighStudent("고길동", 100);
		
		hs.examTake();
		hs.examSolve();
		hs.examSubmit();
		System.out.println(hs.name + "님의 점수는 " + hs.score + "점 입니다.");
		
		System.out.println();
		
		HighStudent hs2 = new HighStudent("김둘리", 30);
		
		hs2.examTake();
		hs2.examSolve();
		hs2.examSubmit();
		System.out.println(hs2.name + "님의 점수는 " + hs2.score + "점 입니다.");
	}

}
