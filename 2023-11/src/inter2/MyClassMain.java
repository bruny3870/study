package inter2;

/*
 출력 예) 11111111
 		Tv를 켭니다.
 		현재 Tv 볼륨 : 5
		22222222
		오디오를 켭니다.
		현재 오디오 볼륨 : 5
		오디오를 켭니다.
		현재 오디오 볼륨 : 5
		33333333
		오디오를 켭니다.
		현재 오디오 볼륨 : 5
		44444444
		Tv를 켭니다.
		현재 Tv 볼륨 : 5
 */

//강사님 방법
public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("11111111");		//MyClass 1번 사용
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		
		System.out.println("22222222");		//MyClass 2번 사용 (매개변수)
		Audio a = new Audio();
		MyClass mc2 = new MyClass(a);		//new MyClass(new Audio());
		
		System.out.println("33333333");		//MyClass 3번 사용
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("44444444");		//MyClass 4번 사용 (매개변수)
		MyClass mc4 = new MyClass();
		mc4.methodA(new Tv());
	}

}
