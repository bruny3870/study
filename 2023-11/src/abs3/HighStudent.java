package abs3;

public class HighStudent extends Student {
	//생성자
	HighStudent(String name, int score) {
		super(name, score);
	}
	
	@Override
	void examTake() {
		System.out.println(name + "이(가) 교실에서 시험지를 받습니다.");
	}
	
	@Override
	void examSolve() {
		System.out.println(name + "이(가) 교실에서 문제를 풉니다.");
	}
	
	@Override
	void examSubmit() {
		System.out.println(name + "이(가) 교실에서 시험지를 제출합니다.");
	}
}
