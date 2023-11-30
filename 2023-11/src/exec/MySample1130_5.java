package exec;

public class MySample1130_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals 메소드 오버라이딩
		Person p1 = new Person(1023456777722L);		//long 타입 맨뒤에 L 넣으면 인식
		Person p2 = new Person(1023456777722L);
		
		if (p1 == p2) {
			System.out.println("p1과 p2가 같습니다");
			
		} else {
			System.out.println("p1과 p2가 다릅니다");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1과 p2가 같습니다2");
			
		} else {
			System.out.println("p1과 p2가 다릅니다2");
		}
	}

}

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {		//타입 확인
			
			if (this.id == ((Person)obj).id) {
				return true;
				
			} else {
				return false;
			}
			
			//위 if절을 1줄로 표현 가능
			//return this.id == ((Person)obj).id;
			
		} else {
			return false;
		}
		
	}
}
