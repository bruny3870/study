package inter2;

/*
 ��� ��) 11111111
 		Tv�� �մϴ�.
 		���� Tv ���� : 5
		22222222
		������� �մϴ�.
		���� ����� ���� : 5
		������� �մϴ�.
		���� ����� ���� : 5
		33333333
		������� �մϴ�.
		���� ����� ���� : 5
		44444444
		Tv�� �մϴ�.
		���� Tv ���� : 5
 */

//����� ���
public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("11111111");		//MyClass 1�� ���
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		
		System.out.println("22222222");		//MyClass 2�� ��� (�Ű�����)
		Audio a = new Audio();
		MyClass mc2 = new MyClass(a);		//new MyClass(new Audio());
		
		System.out.println("33333333");		//MyClass 3�� ���
		MyClass mc3 = new MyClass();
		mc3.methodA();
		
		System.out.println("44444444");		//MyClass 4�� ��� (�Ű�����)
		MyClass mc4 = new MyClass();
		mc4.methodA(new Tv());
	}

}
