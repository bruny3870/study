package etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySample1204_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList �� LinkedList ��
		ArrayList a = new ArrayList(2000000);
		LinkedList l = new LinkedList();
		
		System.out.println("���������� �߰�....");
		//�迭�̹Ƿ� ArrayList�� ����
		System.out.println("ArrayList : " + add1(a));		
		System.out.println("LinkedList : " + add1(l));
		
		System.out.println();
		
		System.out.println("�߰��� �߰�....");
		//�ּҰ����� �߰��ϹǷ� LinkedList�� ����
		System.out.println("ArrayList : " + add2(a));
		System.out.println("LinkedList : " + add2(l));		
		
		System.out.println();
		
		System.out.println("�߰��� ����....");
		//�ּҰ����� �����ϹǷ� LinkedList�� ����
		System.out.println("ArrayList : " + remove2(a));
		System.out.println("LinkedList : " + remove2(l));	
		
		System.out.println();
		
		System.out.println("���������� ����....");
		//�迭�̹Ƿ� ArrayList�� ����
		System.out.println("ArrayList : " + remove1(a));	
		System.out.println("LinkedList : " + remove1(l));
	}
	
	//���������� �߰�
	public static long add1(List list) {
		long start = System.currentTimeMillis();		//���� �ð��� �и����������
		
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");		//���ڿ��� ����
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;		//������ �ð� - ������ �ð� = �ҿ�ð�
	}
	
	//�߰��� �߰�
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list.add(500, "X");		//500��°�� X�� �߰�
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;		//������ �ð� - ������ �ð� = �ҿ�ð�
	}
	
	//���������� ����
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	//�߰��� ����
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
}
