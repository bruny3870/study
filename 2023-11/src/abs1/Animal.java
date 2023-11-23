package abs1;

/*
 ����) Animal Ŭ������ �߻�Ŭ������ �����ϰ� �̸�(name), ����(age) ������ �����ϰ� ������(�Ű����� 2��)�� ���� �� ����
 �̵��ϴ� �żҵ�(move), �Դ� �޼ҵ�(eat) �����Ͽ� �̵��� "�̵��Ѵ�", �Դ°��� "�Դ´�" �� ���
 �ڽ� Ŭ�������� �ݵ�� ������ �ϵ��� bark() �޼ҵ�� ¢�°� ����
 ��� ��) �̵��Ѵ�
 		�۸�
 		�Դ´�
 		�̵��Ѵ�
 		�߿�
 		�Դ´�
 */

public abstract class Animal {
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void bark();
}
