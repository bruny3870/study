package etc;

import java.util.Vector;

public class MySample1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		print(v);
		
		//�� ���� ���ֱ� (�뷮�� ũ�Ⱑ ����)
		v.trimToSize();		//�뷮 5���� 3���� ���� (������ ���̿� �����ϰ� ����)
		System.out.println("v.trimToSize()....");
		print(v);
		
		//���� �뷮 ����
		v.ensureCapacity(6);	//�뷮 3���� 6���� ����
		System.out.println("v.ensureCapacity()....");
		print(v);
		
		 v.setSize(7);		//�� 7�� �� 3���� ���� �����Ƿ� 4���� null�� ä��, capacity�� 6����� 12���� ����
		 System.out.println("v.setSize()....");
		 print(v);
		 
		 v.clear();		//�����͸� ����, �뷮�� ����
		 System.out.println("v.clear()....");
		 print(v);
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());			//���Ϳ� �� �ִ� ������ ����
		System.out.println("capacity : " + v.capacity());	//���Ϳ� ���� �Ǿ��ִ� �뷮 ����
	}

}
