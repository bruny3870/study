class Tv {
	//인스턴스 변수
	String color;		//tv색상
	boolean power;		//전원상태 (on/off)
	int channel;		//채널
	
	//매서드
	void power() {
		power = !power;		//true면 false / false면 true
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	//참조형변수를 활용한 에제 샘플용
	void channelTest(Tv a) {
		System.out.println("Tv channelTest() a.channel : " + a.channel);
		a.channel = 20;
		System.out.println("후 Tv channelTest() a.channel : " + a.channel);
	}
	
	void channelTest2(int ch) {
		System.out.println("Tv channelTest2() ch : " + ch);
		ch = 20;
		System.out.println("후 Tv channelTest2() ch : " + ch);
	}
}


public class MySample1113_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Tv t = new Tv();		//객체 선언
		
		t.channel = 11;
		t.channelDown();
		t.channelUp();
		System.out.println("현재 체널은 " + t.channel + " 입니다.");
		
		//현재 체널 11에서 7로 변경 설정
		t.power();
		t.color = "검정";
		
		for (int i = t.channel; i > 7; i--) {
			t.channelDown();
		}
		
		System.out.printf("tv전원은 %b 이고, 색상은 %s, 채널은 %d 입니다.\n", t.power, t.color, t.channel);
		*/
		
		/*
		 실행결과) t1의 channel 값은 0 입니다.
		 		t2의 channel 값은 0 입니다.
		 		t1의 channel 값을 7 로 변경했습니다.
		 		t1의 channel 값은 7 입니다.
		 		t2의 channel 값은 7 입니다.		//참조형 대입으로 처리
		 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		
		t1.channel = 7;
		
		System.out.println("t1의 channel값을 " + t1.channel + " 로 변경했습니다.");
		
		t2 = t1;
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		*/
		
		/*
		 실행결과) t1의 channel 값은 0 입니다.
		 		t2의 channel 값은 0 입니다.
		 		t1의 channel 값을 5 로 변경했습니다.		//변수에 값 대입
		 		t2의 channel 값을 11 로 변경했습니다.		//변수에 값 대입
		 		t1의 channel 값은 11 입니다.
		 		t2의 channel 값은 11 입니다.
		 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		
		t1.channel = 5;
		t2.channel = 11;
		
		System.out.println("t1의 channel값을 " + t1.channel + " 로 변경했습니다.");
		System.out.println("t2의 channel값을 " + t2.channel + " 로 변경했습니다.");
		
		t1 = t2;
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		*/
		
		//객체 배열
		Tv[] t1 = new Tv[3];		
		int i;
		
		for (i = 0; i < t1.length; i++) {
			t1[i] = new Tv();		//객체 생성
			t1[i].channel = i + 10;
			
			System.out.printf("전 t1[%d], channel = %d \n", i, t1[i].channel);
		}
		
		System.out.println();
		
		for (i = 0; i < t1.length; i++) {
			t1[i].channelUp();
			
			System.out.printf("후 t1[%d], channel = %d \n", i, t1[i].channel);
		}
		
		//객체배열 복사 응용
		System.out.println("t1 : " + t1);			//t1[0] 시작주소 값
		System.out.println("t1[0] : " + t1[0]);		//new Tv 시작주소 값
		System.out.println("t1[1] : " + t1[1]);
		System.out.println("t1[2] : " + t1[2]);
		
		Tv a = new Tv();
		
		System.out.println("a : " + a);
		
		a = t1[1];
		
		System.out.println("후 a : " + a);
		
		System.out.println("a.channel : " + a.channel + ", t1[1].channel : " + t1[1].channel);
		
		a.channel = 20;
		
		System.out.println("후 a.channel : " + a.channel + ", t1[1].channel : " + t1[1].channel);
		
		System.out.println();
		
		//참조형 변수를 활용한 예제
		Tv z = new Tv();
		z.channel = 11;		//참조형 - 주소
		
		System.out.println("main() z.channel : " + z.channel);
		
		z.channelTest(z);
		
		System.out.println("후 main() z.channel : " + z.channel);
		
		System.out.println();
		
		int ch = 11;		//기본형 - 값
		
		System.out.println("main() ch : " + ch);
		z.channelTest2(ch);
		System.out.println("후 main() ch : " + ch);
	}

}
