class Card {
	String kind;				//인스턴스 변수
	int number;					//인스턴스 변수
	
	static int width = 100;		//클래스 변수
	static int height = 250;	//클래스 변수
}


public class MySample1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + " " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		c1.number = 12;
		c2.number = 8;
		
		c1.width = 50;		//클래스변수는 인스턴스변수와 달리 공통 관리
		c1.height = 80;
		
		System.out.println("변경 후 ==========================");
		System.out.println("c1은 " + c1.kind + " " + c1.number + " 이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + " " + c2.number + " 이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}
