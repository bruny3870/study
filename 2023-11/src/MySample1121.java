/*
 문제) 친구 정보를 기록할 MyFriendInfo클래스를 상세정보를 기록한 MyFriendDetailInfo클래스에 상속하고 
 	  이름, 나이는 MyFriendInfo클래스에 주소, 전화번호는 MyFriendInfoDetailInfo클래스에 입력 할 수 있도록 구현
 출력 예) 이름 : 이순신
 		나이 : 100
 		주소 : 성균관
 		전화 : 010 - 1111 - 2222
 단) 각 클래스에서 출력하는 메서드가 존재하며, main메서드에서는 생성자와 출력메서드 한번만 호출(자식클래스)
 	 입력값은 생성자를 통해서 하드코딩하여 저장
 */
class MyFriendInfo {
	String name;
	int age;
	
	MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void printMyFriendInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
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
		System.out.println("주소 : " + this.addr);
		System.out.println("전화 : " + this.tel);
	}
}

public class MySample1121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFriendDetailInfo m = new MyFriendDetailInfo("이순신", 100, "성균관", "010 - 1111 - 2222");
		m.printMyFriendDetailInfo();
	}
	
}
