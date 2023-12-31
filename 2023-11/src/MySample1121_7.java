import java.util.Scanner;

/*
 문제) 이름, 나이, 직업을 입력 받아 화면에 출력하며, 이름에 "끝"이 입력되면 종료되는 프로그램
 단) 이름, 나이, 직업과 관련된 정보는 메소드를 사용하여 작성 (private)
 	문자열 비교 => 변수명.equals("끝");
 	이름, 나이, 직업을 관리하는 클래스 Person3
 	예외처리 => 프로그램 종료 여부와 정보출력 msgPrint
 입력 예) 이름 => 홍길동
 		나이 => 23
 		직업 => 프로그래머
 출력 예) 홍길동님의 나이는 23살 이며, 직업은 프로그래머입니다.
 
 입력 예) 이름 => 끝
 		나이 => 22
 		직업 => 백수
 출력 예) 프로그램을 종료합니다.
 */
class Person3 {
	private String name;
	private int age;
	private String job;
	
	Person3 () {
		this("", 0, "");
	}
	
	Person3 (String name, int age, String job) {
		setName(name);
		setAge(age);
		setJob(job);
	}
	
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
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	//프로그램 종료여부와 출력
	//return boolean
//	public boolean msgPrint() {
//		if (getName().equals("끝")) {
//			System.out.println("프로그램이 종료되었습니다.");
//			return true;
//		} else {
//			System.out.println(getName() + " 님의 나이는 " + getAge() + "살 이며, 직업은 " + getJob() + " 입니다.");
//			return false;
//		}
//	}
	
	//return int
	public int msgPrint() {
		if (getName().equals("끝")) {
			System.out.println("프로그램이 종료되었습니다.");
			return 1;
		} else {
			System.out.println(getName() + " 님의 나이는 " + getAge() + "살 이며, 직업은 " + getJob() + " 입니다.");
			return 0;
		}
	}
}

public class MySample1121_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//접근 제어자
		/*
		 trim() : 문자열의 맨 앞과 맨 뒤 공백만 제거
		 replace(" ", "") : 문자열에서 첫번째 인수를 찾아 두번째 인수로 변경
		 replaceAll(" ", "") : 문자열에서 첫번째 인수를 찾아 두번째 인수로 변경
		 */
//		String tmp = "   홍길동   ";
//		System.out.println("[" + tmp + "]");
//		System.out.println("trim() : [" + tmp.trim() + "]");
//		System.out.println("replace() : [" + tmp.replace(" ", "") + "]");		//공백을 공백없음으로 변경
//		System.out.println("replaceAll() : [" + tmp.replaceAll(" ", "") + "]");
		//replace 와 replaceAll 은 비슷함
		
		Scanner sc = new Scanner(System.in);
		Person3 p = new Person3();			//while 안에 선언시 무한 생성으로 메모리 낭비 주의
		
		//무한루프
		while (true) {
			System.out.print("이름 => ");
			p.setName(sc.next());			//nextLine()메소드는 엔터키값을 가지고 있어 next()메소드 사용
			
			System.out.print("나이 => ");
			p.setAge(sc.nextInt());
			
			System.out.print("직업 => ");
			p.setJob(sc.next());
			
			//return boolean
//			if (p.msgPrint() == true) {
//				break;
//			}
			
			//return int
			if (p.msgPrint() == 1) {
				break;
			}
		}
	}

}
