class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv3 extends Product2 {
	Tv3() {
		super(900);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(500);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("안돼 돌아가");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구매");
	}
}

public class MySample1123_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		System.out.println("보유금액 : " + b.money);
		
		Product2 p = new Tv3();
		b.buy(p);
		
		System.out.println("구매제품 : " + p.price);
		System.out.println("남은 돈 : " + b.money);
		System.out.println("보너스포인트 : " + b.bonusPoint);
		
		Product2 p2 = new Computer2();
		b.buy(p2);
		
		System.out.println("구매제품 : " + p2.price);
		System.out.println("남은 돈 : " + b.money);
		System.out.println("보너스포인트 : " + b.bonusPoint);
	}

}
