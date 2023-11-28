package inter2;

public class RemoteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t = new Tv();
		Audio a = new Audio();
		
		System.out.println("11111111");
		t.turnOn();
		t.setVolume(5);
		System.out.println("22222222");
		a.turnOn();
		a.setVolume(5);
		System.out.println("33333333");
		a.turnOn();
		a.setVolume(0);
		System.out.println("44444444");
		t.turnOn();
		t.setVolume(10);
	}

}
