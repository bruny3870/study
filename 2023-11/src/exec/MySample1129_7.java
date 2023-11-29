package exec;

import java.util.Scanner;

public class MySample1129_7 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int inputScore() throws ScoreException {
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			ScoreException ex = new ScoreException("������ 0 ~ 100�� ���� �Է��ϼ���");
//			ScoreException ex = new ScoreException();		//�����Է¿���
			throw ex;
		}
			
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ó�� - Ŭ����
		try {
			System.out.print("���� ���� �Է� => ");
			int kor = inputScore();		//�޼ҵ� ����ó���̱� ������ try �ȿ� ����
			System.out.println("���� ������ " + kor + "�� �Դϴ�");
			
			System.out.print("���� ���� �Է� => ");
			int eng = inputScore();
			System.out.println("���� ������ " + eng + "�� �Դϴ�");
			
		} catch (Exception e) {
			System.out.println("�����޼��� : " + e.getMessage());
			
		} finally {
			System.out.println("���α׷� ����");
		}
	}

}

//Ŭ���� ����ó��
class ScoreException extends Exception {
	ScoreException() {
		super("���� �Է� ����");
	}
	
	ScoreException(String msg) {
		super(msg);
	}
}
