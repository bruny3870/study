import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class MySample1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 문제) 5명의 학생의 3과목 점수를 더해서 각 학생의 총점과 평균을 계산하고, 과목별 총점을 계산하는 프로그램
		 단) 과목은 score 2차원배열에 저장, 출력 번호 %3d, 각 점수는 %5d, 평균 %5.1f 적용
		 실행결과) 번호		국어		영어		수학		총점		평균
		 	    =============================================
		 	      1		100		100		100		300		100.0
		 	      2		 20		 20		 20		 60		 20.0
		 	      3		 30		 30		 30		 90		 30.0
		 	      4		 40		 40		 40		120		 40.0
		 	      5		 50		 50		 50		150		 50.0
		 	    =============================================
		 	    총점		240		240		240
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
