class Product3 {
	int price;
	int bonusPoint;
	
	//생성자
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv4 extends Product3 {
	//생성자
	Tv4() {
		super(300);
	}
	
	//오버라이딩
	public String toString() {
		return "Tv";
	}
}

class Computer3 extends Product3 {
	//생성자
	Computer3() {
		super(100);
	}
	
	//오버라이딩
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product3 {
	//생성자
	Audio() {
		super(50);
	}
	
	//오버라이딩
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product3[] item = new Product3[10];		//객체 배열 선언
	int cnt = 0;							//배열에 사용될 카운트
	
	//메소드
	void buy(Product3 p) {					//매개변수 다형성
		if (money < p.price) {
			System.out.println("잔액 부족으로 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[cnt++] = p;					//제품을 배열에 저장
		System.out.println(p + "을(를) 구매하셨습니다.");		//각 클래스에 toString 오버라이딩 메소드 호출
		
		int i;
		
		//구매제품 목록 배열 저장
//		for (i = 0; i < item.length; i++) {		//배열 선언만큼 출력 (item[9]까지)
//			System.out.println("item[" + i + "] : " + item[i]);
//		}
		
		for (i = 0; i < cnt; i++) {				//들어간거만 출력 (item[2]까지)
			System.out.println("item[" + i + "] : " + item[i]);
		}
	}
	
	//메소드
	void summary() {
		int sum = 0;				//구매제품 가격 합계
		String itemList = "";		//구매제품 목록
		int i;
		
		//구매한 제품의 합계와 목록
		for (i = 0; i < item.length; i++) {
			if (item[i] == null) {		//제품구매 안함
				break;
			}
			
			sum += item[i].price;
			
			itemList += item[i].toString() + ", ";		//toString 메소드 출력
		}
		
		System.out.println("구매한 제품의 총 가격은 " + sum + "만원 입니다.");
		System.out.println("구매한 제품은 " + itemList + "입니다.");
		System.out.println("구매한 제품의 총 보너스 포인트는 " + bonusPoint + "점 입니다.");
	}
}

public class MySample1123_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성 - 객체를 배열로
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv4());
		b.buy(new Computer3());
		b.buy(new Audio());
		b.summary();
	}

}
