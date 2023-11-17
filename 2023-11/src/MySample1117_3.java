class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.err.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person {
	void learn() {
		System.out.println("공부하기....");
	}
}

class Teacher extends Person {
	void teach() {
		System.out.println("설명하기....");
	}
}

public class MySample1117_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
		Student s1 = new Student();
		s1.breath();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.breath();
		t1.say();
		t1.teach();
	}

}
