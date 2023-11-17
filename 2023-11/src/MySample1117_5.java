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
		super(name, job, age);		//무조건 첫번째 줄 위치
		this.score = score;
	}
	
	void print() {
		//System.out.println("이름 : " + super.name + ", 직업 : : " + super.job + ", 나이 : " + super.age + ", 점수 : " + this.score);
		//변수의 중복이 없어 super 와 this 생략 가능
		System.out.println("이름 : " + name + ", 직업 : " + job + ", 나이 : " + age + ", 점수 : " + score);
	}
}

class Teacher2 extends Person2 {
	int pay;
	
	Teacher2(String name, String job, int age, int pay) {
//		super.name = name;
//		super.job = job;
//		super.age = age;
		super(name, job, age);		//무조건 첫번째 줄 위치
		this.pay = pay;
	}
	
	void print() {
		//System.out.println("이름 : " + super.name + ", 직업 : : " + super.job + ", 나이 : " + super.age + ", 급여 : " + this.pay);
		//변수의 중복이 없어 super 와 this 생략 가능
		System.out.println("이름 : " + name + ", 직업 : " + job + ", 나이 : " + age + ", 급여 : " + pay);
	}
}

public class MySample1117_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
		Student2 s1 = new Student2("홍길동", "학생회장", 19, 100);
		s1.print();
		
		Teacher2 t1 = new Teacher2("고길동", "소드마스터", 40, 1000);
		t1.print();
	}

}
