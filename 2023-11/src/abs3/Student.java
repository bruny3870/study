package abs3;

//추상클래스
public abstract class Student {
	String name;
	int score;
	
	//생성자
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//추상메소드
	abstract void examTake();		//시험보기
	abstract void examSolve();		//시험풀이
	abstract void examSubmit();		//시험제출
}
