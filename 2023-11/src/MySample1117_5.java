class Person2 {
	String name;
	String job;
	int age;
	
	Person2(String name, String job, int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}
}

class Student2 extends Person2 {
	int score;
	
	Student2(String name, String job, int age, int score) {
//		super.name = name;
//		super.job = job;
//		super.age = age;
		super(name, job, age);		//������ ù��° �� ��ġ
		this.score = score;
	}
	
	void print() {
		//System.out.println("�̸� : " + super.name + ", ���� : : " + super.job + ", ���� : " + super.age + ", ���� : " + this.score);
		//������ �ߺ��� ���� super �� this ���� ����
		System.out.println("�̸� : " + name + ", ���� : " + job + ", ���� : " + age + ", ���� : " + score);
	}
}

class Teacher2 extends Person2 {
	int pay;
	
	Teacher2(String name, String job, int age, int pay) {
//		super.name = name;
//		super.job = job;
//		super.age = age;
		super(name, job, age);		//������ ù��° �� ��ġ
		this.pay = pay;
	}
	
	void print() {
		//System.out.println("�̸� : " + super.name + ", ���� : : " + super.job + ", ���� : " + super.age + ", �޿� : " + this.pay);
		//������ �ߺ��� ���� super �� this ���� ����
		System.out.println("�̸� : " + name + ", ���� : " + job + ", ���� : " + age + ", �޿� : " + pay);
	}
}

public class MySample1117_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		Student2 s1 = new Student2("ȫ�浿", "�л�ȸ��", 19, 100);
		s1.print();
		
		Teacher2 t1 = new Teacher2("��浿", "�ҵ帶����", 40, 1000);
		t1.print();
	}

}
