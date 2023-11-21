class Card2 {
	//상수 선언
	static final int KIND_MAX = 4;		//카드 무늬 수
	static final int NUM_MAX = 13;		//무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	//변수 선언
	int kind;
	int number;
	
	Card2() {
		this(SPADE, 1);		//(4, 1)
	}
	
	Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";		//0 ~ 13까지 (X-10 J-11 Q-12 K-13)
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}

class Deck {
	final int CARD_NUM = 52;					//카드 개수
	Card2[] cardArr = new Card2[CARD_NUM];		//카드 개수만큼 배열 생성
	
	//카드 52장 생성
	Deck() {
		int i = 0;
		int k, n;
		
		for (k = Card2.KIND_MAX; k > 0; k--) {		//KIND_MAX = 4	(4 ~ 1)
			for (n = 0; n < Card2.NUM_MAX; n++) {	//NUM_MAX = 13	(0 ~ 12)
				System.out.println("Deck() 생성자 : i = " + i + ", k = " + k + ", n : " + n);
				
				cardArr[i++] = new Card2(k, n+1);	//배열 객체 생성 (4의 1 ~ 13, 3의 1 ~ 13, 2의 1 ~ 13, 1의 1 ~13)
			}
		}
	}
	
	//지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
	Card2 pick(int index) {
		return cardArr[index];
	}
	
	//매개변수 없음
	Card2 pick() {
		int index = (int)(Math.random() * CARD_NUM);		//random은 double로 반환해서 int로 형 변환, 0 ~ 51 사이 랜덤 값
		return pick(index);
	}
	
	//카드 순서 섞음
	void shuffle() {
		int i, r;
		Card2 tmp;
		
		for (i = 0; i < cardArr.length; i++) {
			r = (int)(Math.random() * CARD_NUM);			//random은 double로 반환해서 int로 형 변환, 0 ~ 51 사이 랜덤 값
			
			//카드 섞기 (데이터 타입 맞춰야됨 - Card2)
			tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
	
	void printArr() {
		int i;
		
		for (i = 0; i < cardArr.length; i++) {
			System.out.println("cardArr[" + i + "] : " + cardArr[i]);
		}
	}
}

public class MySample1121_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
		/*
		 * 
		 * 
		 실행결과) kind : SPADE, number : 1
		 		 kind : HEART, number : 7
		 */
		Deck d = new Deck();
		Card2 c = d.pick(0);		//카드 섞기 전에 제일 위 카드 뽑기
		System.out.println("before => " + c.toString());
		System.out.println("before => " + c);		//차이없음 (toString 생략가능)
		
		System.out.println();
		
		d.printArr();		//배열에 카드 순서대로 종류, 번호 부여
		
		d.shuffle();		//카드 섞기
		c = d.pick(0);		//카드 섞고 난 뒤 제일 위 카드 뽑기
		System.out.println("after => " + c.toString());
	}

}
