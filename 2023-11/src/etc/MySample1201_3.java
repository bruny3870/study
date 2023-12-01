package etc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MySample1201_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		ArrayList<String> list1 = new ArrayList<String>();		//�⺻ 10��
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		System.out.print("�ʱ���� : ");
		System.out.println(list1 + " size() : " + list1.size());	//�������� ������ üũ
		
		
		System.out.println("�ε��� 1�� B �߰�");
		list1.add(1, "B");		// �߰��� ���� ����
		System.out.println(list1 + " size() : " + list1.size());	//�������� ������ üũ
		
		System.out.println("�ε��� 2 �� ����");
		list1.remove(2);
		System.out.println(list1 + " size() : " + list1.size());	//�������� ������ üũ
		
		System.out.println("�ε��� 2��° ��ġ �� : " + list1.get(2));
		
		System.out.println();
		
		ArrayList list2 = new ArrayList();
		
		list2.add(new Integer(5));
		list2.add(new Integer(4));
		list2.add(new Integer(2));
		list2.add(new Integer(0));
		list2.add(new Integer(1));
		list2.add(new Integer(3));
		
		System.out.println("list2 : " + list2);
		
		ArrayList list3 = new ArrayList(list2.subList(1, 4));		//�ε��� 1°���� (4-1)��°���� ������
//		System.out.println("list3 : " + list3);
		print(list2, list3);
		
		//����
		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//list2�� list3 ��ü�� ���ԵǾ� �ִ��� Ȯ�� (true/false)
		System.out.println("list2.containAll(list3) : " + list2.containsAll(list3));
		System.out.println("list3.containAll(list2) : " + list3.containsAll(list2));
		
		list3.add("B");
		list3.add("C");
		list3.add(3, "A");
		print(list2, list3);
		
		//list2���� list3�� ��ġ�� �κи� ����� ����
		System.out.println("list2.retainAll(list3) : " + list2.retainAll(list3));
		print(list2, list3);
		
		//list3���� list2�� ���Ե� ��ü ����
		int i;
		
		for (i = list3.size() - 1; i >= 0; i--) {
			if(list2.contains(list3.get(i))) {
				list3.remove(i);
				
			}
		}
		
		print(list2, list3);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list2 : " + list1);
		System.out.println("list3 = " + list2);
		System.out.println();
	}
}
