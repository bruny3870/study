package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class MySample1201_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		/*
		 ����) 5���� ������ �Է¹޾� ArrayList�� ���� �� �̵� �� ������ ���̰� ���� �� ������ ����ϴ� ���α׷�
		 �Է� ��) ���Ϸ���
		 		ũ����
		 		���
		 		���뷼��
		 		�޷����ϴ�
		 ��� ��) ���� ���̰� �� ������ => �޷����ϴ�
		 ��) �� ������ ���̴� ��� �ٸ��� �Է���
		 */
//		ArrayList<String> list = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		int i;
//		int max = 0;
//		
//		for (i = 0; i < 5; i++) {
//			list.add(sc.nextLine());
//		}
//		
//		for (i = 0; i < 5; i++) {
//			if (list.get(max).length() < list.get(i).length()) {
//				max = i;
//			}
//		}
//		
//		System.out.println("���� ���̰� �� ������ => " + list.get(max));
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int[] lengthArr = new int[5];
		int max = lengthArr[0];
		int i;
		
		for (i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		
		for (i = 0; i < 5; i++) {
			lengthArr[i] = list.get(i).length();
			
			if (max < lengthArr[i]) {
				max = lengthArr[i];
			}
		}
		
		for (i = 0; i < 5; i++) {
			if (max == list.get(i).length()) {
				System.out.println("���� ���̰� �� ������ => " + list.get(i));
				break;
			}
		}
	}

}
