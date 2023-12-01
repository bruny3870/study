package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MySample1201_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleDateFormat (��¥ �����͸� ���ϴ� ���·� �پ��ϰ� ���
		Date today = new Date();
		
		SimpleDateFormat s1, s2, s3, s4;
		SimpleDateFormat s5, s6, s7, s8, s9;
		
		s1 = new SimpleDateFormat("yyyy-MM-dd");
		s2 = new SimpleDateFormat("yy�� MMM dd�� E����");
		s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");	//H 24�ð�
		s4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");		//h 12�ð�, a ����/����
		
		s5 = new SimpleDateFormat("������ ������ D��° ���Դϴ�");
		s6 = new SimpleDateFormat("������ �̴��� d��° ���Դϴ�");
		s7 = new SimpleDateFormat("������ ������ w��° ���Դϴ�");
		s8 = new SimpleDateFormat("������ �̴��� W��° ���Դϴ�");
		s9 = new SimpleDateFormat("������ �̴��� F��° E���� �Դϴ�");
		
		System.out.println(s1.format(today));
		System.out.println(s2.format(today));
		System.out.println(s3.format(today));
		System.out.println(s4.format(today));
		
		System.out.println(s5.format(today));
		System.out.println(s6.format(today));
		System.out.println(s7.format(today));
		System.out.println(s8.format(today));
		System.out.println(s9.format(today));
		
		System.out.println();
		
		/*
		 y ��, M ��, d ��, E ����, a ����/����
		 H �ð�(24), h �ð�(12), m ��, s ��
		 */
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String pattern1 = "E���� HH�� mm�� ss��";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("���� ��¥ : " + today);
		System.out.println("�ѱ���(�����) : " + p1.format(today));
		System.out.println("�̱���(���ϳ�) : " + p2.format(today));
		System.out.println("������(�Ͽ���) : " + p3.format(today));
		System.out.println(p4.format(today));
	}

}
