package exec;

import java.util.Calendar;

public class MySample1130_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args.lengh : " + args.length);
		
		if (args.length != 2) {
			System.out.println("args ����.... ��� ���� �Է� �ϼ���");
			return;
		}
		
		//System.out.println("����....");
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();		//������
		Calendar eDay = Calendar.getInstance();		//��������
		
		sDay.set(year, month-1, 1);
		
		//�ش� ���� ��������-�Է� ���� �������� getActualMaximum ��� 
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
		
		//1���� ���� ���� �Ͽ��Ϸ� ��¥ ����
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		
		//������ ���� ���� ����Ϸ� ��¥ ����
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(year + "�� " + month + "�� ");
		System.out.println(" ��\t ��\t ȭ\t ��\t ��\t ��\t ��\t");
		
		//�����Ϻ��� �������ϱ��� (sDay <= eDay) 1�Ͼ� ���� ��Ű�鼭
		//��(Calendar.DATE) ���
		int day; 
		
		for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			day = sDay.get(Calendar.DATE);
			System.out.print((day < 10) ? (" " + day + "\t") : (day + "\t"));
			
			if (n++ % 7 == 0) {
				System.out.println();
			}
		}
	}

}
