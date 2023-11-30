package exec;

public class MySample1130_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toString 메소드 오버라이딩
		Card c1 = new Card();
		Card c2 = new Card("heart", 10);
		
		//오버라이딩한 toString
		System.out.println("c1.toString : " + c1.toString());
		System.out.println("c2.toString : " + c2.toString());
		
		String str = new String("korea");
		String str1 = "korea";
		
		//String 클래스에 있는 toString
		System.out.println("str : " + str);
		System.out.println("str.toString : " + str.toString());
		System.out.println("str1 : " + str1);
		System.out.println("str1.toString : " + str1.toString());
	}

}

class Card {
	String kind;
	int number;
	
	Card() {
		this("sqade", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + this.kind + ", number : " + this.number;
	}
}
