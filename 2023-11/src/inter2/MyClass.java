package inter2;

//강사님 방법
public class MyClass {
	//다형성
	RemoteControl rc = new Tv();
	
	//1번
	MyClass() {
		
	}
	
	//2번
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		this.rc.turnOn();
		this.rc.setVolume(5);
	}
	
	//3번
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//4번
	//메소드오버로딩
	void methodA(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
