package abs3;

public class HighStudent extends Student {
	//������
	HighStudent(String name, int score) {
		super(name, score);
	}
	
	@Override
	void examTake() {
		System.out.println(name + "��(��) ���ǿ��� �������� �޽��ϴ�.");
	}
	
	@Override
	void examSolve() {
		System.out.println(name + "��(��) ���ǿ��� ������ Ǳ�ϴ�.");
	}
	
	@Override
	void examSubmit() {
		System.out.println(name + "��(��) ���ǿ��� �������� �����մϴ�.");
	}
}
