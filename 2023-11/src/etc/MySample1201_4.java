package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class MySample1201_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		/*
		 ����) 5���� ��� �̸��� �Է¹޾� ArrayList�� ���� �� '��'�� ���� ���� ����� ��� ����ϴ� ���α׷�
		 �Է� ��) ȫ�浿
		 		�̵Ѹ�
		 		��浿
		 		��Ѹ�
		 		�ֱ浿
		 ��� ��) [��浿]	[��Ѹ�]
		 		�达 ���� ���� ���� ��� 2�� �Դϴ�
		 ��) �Է½� nextLine() ���, '��'���� �����Ѱ��� ã�� �޼ҵ�� get(i).startsWith("��") -> true/false ��ȯ
		 */
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int i;
		int cnt = 0;
		
		//5�� �Է� ����
		for (i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		
		//�达 ����
		for (i = 0; i < 5; i++) {
			if (list.get(i).startsWith("��")) {		//����Ʈ�� ����� �� �����ͼ�(list.get(i) �达 ã��(startsWith("��")
				System.out.print("[" + list.get(i) + "] \t");
				cnt++;
			}
		}
		
		System.out.println();
		System.out.println("�达 ���� ���� ���� ��� " + cnt + "�� �Դϴ�");
	}

}
