/*
 ����) ģ�� ������ ����� MyFriendInfoŬ������ �������� ����� MyFriendDetailInfoŬ������ ����ϰ� 
 	  �̸�, ���̴� MyFriendInfoŬ������ �ּ�, ��ȭ��ȣ�� MyFriendInfoDetailInfoŬ������ �Է� �� �� �ֵ��� ����
 ��� ��) �̸� : �̼���
 		���� : 100
 		�ּ� : ���հ�
 		��ȭ : 010 - 1111 - 2222
 ��) �� Ŭ�������� ����ϴ� �޼��尡 �����ϸ�, main�޼��忡���� �����ڿ� ��¸޼��� �ѹ��� ȣ��(�ڽ�Ŭ����)
 	 �Է°��� �����ڸ� ���ؼ� �ϵ��ڵ��Ͽ� ����
 */
class MyFriendInfo {
	String name;
	int age;
	
	MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void printMyFriendInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
	}
}

class MyFriendDetailInfo extends MyFriendInfo {
	String addr;
	String tel;
	
	MyFriendDetailInfo(String name, int age, String addr, String tel) {
		super(name, age);
		this.addr = addr;
		this.tel = tel;
	}
	
	void printMyFriendDetailInfo() {
		printMyFriendInfo();
		System.out.println("�ּ� : " + this.addr);
		System.out.println("��ȭ : " + this.tel);
	}
}

public class MySample1121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFriendDetailInfo m = new MyFriendDetailInfo("�̼���", 100, "���հ�", "010 - 1111 - 2222");
		m.printMyFriendDetailInfo();
	}
	
}
