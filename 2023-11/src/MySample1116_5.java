
public class MySample1116_5 {
	/*
	static int cv = 1;
	int iv = 2;
	
	//클래스 초기화 블록
	static {												//1
		System.out.println("클래스 초기화 영역");					//클래스변수 할당 될때 같이 실행, 1번만 호출
		cv = 10;
	}
	
	//인스턴스 초기화 블록
	{														//3	//6	
		System.out.println("인스턴스 초기화 영역");				//생성자를 호출하면 생성자가 호출되기 직전에 초기화 블록이 호출
		iv = 20;
	}
	
	//생성자
	MySample1116_5() {										//4	//7
		System.out.println("생성자 호출");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초기화 블록
		System.out.println("메인 메소드 시작");					//2
		
		MySample1116_5 m1 = new MySample1116_5();
		System.out.println("메인 메소드 2번째 실행");				//5
		
		MySample1116_5 m2 = new MySample1116_5();
		
		System.out.println("메인 메소드 끝");					//8
	}
	*/
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품번호(serialNo) : " + p1.serialNo);
		System.out.println("p2 제품번호(serialNo) : " + p2.serialNo);
		System.out.println("p3 제품번호(serialNo) : " + p3.serialNo);
		System.out.println("객체 생성 수 : " + Product.count);
	}
}

class Product {
	static int count = 0;
	int serialNo;

	//인스턴스 초기화
	{
		System.out.println("인스턴스 초기화 블록 시작 count : " + count + ", serialNo : " + serialNo);
		
		++count;
		serialNo = count;
		
		System.out.println("인스턴스 초기화 블록 끝 count : " + count + ", serialNo : " + serialNo);
	}
	
	Product() {
		System.out.println("Product() 생성자");
	}
}
