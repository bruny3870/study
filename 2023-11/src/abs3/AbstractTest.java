package abs3;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻�Ŭ���� ����
		HighStudent hs = new HighStudent("��浿", 100);
		
		hs.examTake();
		hs.examSolve();
		hs.examSubmit();
		System.out.println(hs.name + "���� ������ " + hs.score + "�� �Դϴ�.");
		
		System.out.println();
		
		HighStudent hs2 = new HighStudent("��Ѹ�", 30);
		
		hs2.examTake();
		hs2.examSolve();
		hs2.examSubmit();
		System.out.println(hs2.name + "���� ������ " + hs2.score + "�� �Դϴ�.");
	}

}
