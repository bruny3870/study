import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class MySample1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 ����) 5���� �л��� 3���� ������ ���ؼ� �� �л��� ������ ����� ����ϰ�, ���� ������ ����ϴ� ���α׷�
		 ��) ������ score 2�����迭�� ����, ��� ��ȣ %3d, �� ������ %5d, ��� %5.1f ����
		 ������) ��ȣ		����		����		����		����		���
		 	    =============================================
		 	      1		100		100		100		300		100.0
		 	      2		 20		 20		 20		 60		 20.0
		 	      3		 30		 30		 30		 90		 30.0
		 	      4		 40		 40		 40		120		 40.0
		 	      5		 50		 50		 50		150		 50.0
		 	    =============================================
		 	    ����		240		240		240
		 */
		int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}, {50, 50, 50}};
		int i, j;
		int totalKor = 0, totalEng = 0, totalMath = 0;
		int sum = 0;
		double avg = 0.0;
		
		for (i = 0; i < score.length; i++) {
			System.out.printf("%3d", i + 1);
			sum = 0;
			totalKor += score[i][0];
			totalEng += score[i][1];
			totalMath += score[i][2];
			
			for (j = 0; j < score[i].length; j++) {
				System.out.printf("%5d", score[i][j]);
				sum += score[i][j];
			}
			
			avg = sum / (double)score[i].length;
			System.out.printf("%5d %5.1f \n", sum, avg);
		}
		
		System.out.printf("%5d %5d %5d", totalKor, totalEng, totalMath);
	}

}
