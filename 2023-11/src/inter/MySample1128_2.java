package inter;

//인터페이스
interface Providable {
	//추상메소드
	public abstract void leisureSports();		//래저스포츠
	public abstract void sightSeeling();		//관광
	public abstract void food();				//음식
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	
	@Override
	public void sightSeeling() {
		System.out.println("경복궁 관광 투어");
	}
	
	@Override
	public void food() {
		System.out.println("불고기 투어");
	}
}

class TourGuide {
	private Providable tour = new KoreaTour();		//다형성
	
	//오버라이딩 아님
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightSeeling() {
		tour.sightSeeling();
	}
	
	public void food() {
		tour.food();
	}
}

public class MySample1128_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//캡슐, 상속, 다형성 모두 적용
		TourGuide guide = new TourGuide();
		
		guide.leisureSports();
		guide.sightSeeling();
		guide.food();
	}

}
