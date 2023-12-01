package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MySample1201_6 {
	
	public static int randomRange(int min, int max, Random random) {
		if (min > max) {
			return min;
		}
		
		//�����߻� - min ~ max ���� ���� �߻�
		return random.nextInt((max + 1) - min) + min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//�л� ����Ʈ ����
		List<Student> list = new ArrayList<Student>();
		
		//���� ���� �Է�
		int i;
		
		for (i = 1; i <= 20; i++) {
			list.add(new Student(1, 1, i, "ȫ�浿" + i, randomRange(40, 100, random), randomRange(40, 100, random), randomRange(40, 100, random)));
		}
		
		//��� ���� �� ���
		System.out.println("################");
		System.out.println("# ��� ���� �� ��� #");
		System.out.println("################");
		
		for (i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
		
		//����� �����ϱ� ���� �������� ����
		int j;
		Student tmp;
		
		for (i = 0; i < list.size() - 1; i++) {
			for (j = i + 1; j < list.size(); j++) {
				if (list.get(i).getSum() < list.get(j).getSum()) {
					tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		
		System.out.println();
		
		//��� ���� �� ���
		System.out.println("################");
		System.out.println("# ��� ���� �� ��� #");
		System.out.println("################");
		int rank = 0;		//���
		int order = 0;		//���� ��� ���� ��
		
		//��� ���� �� ���
		Student s;
		for (i = 0; i < list.size(); i++) {
			s = list.get(i);
			
			if (i == 0) {
				//��� �ʱⰪ 1�� ����
				rank++;
				//���� ��� ������ 1�� ����
				order++;
				
			} else {
				//������ ������
				if (list.get(i - 1).getSum() == s.getSum()) {
					//���� ��� ������ ���� (��� rank�� �հ� ����)
					order++;
					
				} else {
					//������ �ٸ��� (���� ����� ���� ��� ���� ���� ����)
					rank += order;
					//���� ��� ���� �� �ʱ�ȭ
					order = 1;
				}
			}
			
			//��� �ο�
			s.setRank(rank);
			
			//���
			System.out.println(s);
		}
	}

}
