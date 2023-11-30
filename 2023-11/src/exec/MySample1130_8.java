package exec;

import java.util.Calendar;

public class MySample1130_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CalendarŬ����
		Calendar today = Calendar.getInstance();
		
		System.out.println("�⵵ : " + today.get(Calendar.YEAR));
		System.out.println("��, 1��(0) : " + today.get(Calendar.MONTH));
		System.out.println("������ ��° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̹����� ��° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�̴��� ���� : " + today.get(Calendar.DATE));
		System.out.println("������ ���� : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����1(�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�̴��� ��° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����/����(0/1) : " + today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));			//12��
		System.out.println("�ð�(0~23) : " + today.get(Calendar.HOUR_OF_DAY));	//24��
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("�̴��� ������ �� : " + today.getActualMaximum(Calendar.DATE));
			
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2001, 3, 8);
		
		System.out.println("date1 = " + toString2(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�");
		System.out.println("date2 = " + toString2(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�");
		
		System.out.println();
		
		System.out.println("==== 1�� �� ====");
		date2.add(Calendar.DATE, 1);
		System.out.println(toString2(date2));
		
		System.out.println("==== 5�� �� ====");
		date2.add(Calendar.MONTH, -5);
		System.out.println(toString2(date2));
		
		System.out.println("==== 20�� �� ==== (roll)");	//roll �޼ҵ� ���
		date2.roll(Calendar.DATE, 20);					//���� �����ϳ� ���� ������� ����
		System.out.println(toString2(date2));
		System.out.println("==== 20�� �� ==== (add)");	//add �޼ҵ� ���
		date2.add(Calendar.DATE, 20);					//�ϼ��� ���� ���� �Բ� ����
		System.out.println(toString2(date2));
		
	}
	
	public static String toString2(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "�� ";
	}

}
