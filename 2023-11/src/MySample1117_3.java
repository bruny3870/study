class Person {
	void breath() {
		System.out.println("������");
	}
	
	void eat() {
		System.err.println("��Ա�");
	}
	
	void say() {
		System.out.println("���ϱ�");
	}
}

class Student extends Person {
	void learn() {
		System.out.println("�����ϱ�....");
	}
}

class Teacher extends Person {
	void teach() {
		System.out.println("�����ϱ�....");
	}
}

public class MySample1117_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		Student s1 = new Student();
		s1.breath();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.breath();
		t1.say();
		t1.teach();
	}

}
