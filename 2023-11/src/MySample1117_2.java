class Tv2 {
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	Tv2() {
		channel = 11;		//부모 채널
		System.out.println("Tv2() 생성자...");
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv2 {		//상속 extends
	boolean caption;		//자막상태(on/off)
	int channel;
	
	CaptionTv() {
		super();	//부모호출 (생성자에서만 가능)
		channel = 20;		//인스턴스 채널
		System.out.println("CaptionTv() 생성자...");
	}
	
	void displayCaption(String text) {
		int channel = 30;		//지역 채널
		
		if (this.caption) {		//자막상태가 on이면, this 생략가능
			System.out.println("자막내용 : " + text);
		}

		//부모(super), 인스턴스(this)
		System.out.println("부모 channel : " + super.channel);	//부모 채널 출력
		System.out.println("인스턴스 channel : " + this.channel);	//인스턴스 채널 출력
		System.out.println("지역 channel : " + channel);			//지역 채널 출력
	}
	
	int getChannel() {
		return super.channel;		//부모 채널 리턴
	}
}

public class MySample1117_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
		CaptionTv ctv = new CaptionTv();		//상속으로 부모 객체 생성 안 해도 사용 가능
		//하지만 자식인 CaptionTv 생성 전 부모인 Tv2가 먼저 생성된다
		
		System.out.println("1channel : " + ctv.channel);		//자식 채널 출력
		
		ctv.channel = 10;		//자식 채널 변경
		ctv.channelUp();		//부모 메소드 호출, 부모 채널 업
		System.out.println("2channel : " + ctv.channel);		//자식 채널이라 채널 업 안됨, 채널 변경 가능
		
		ctv.displayCaption("Hello JAVA....");		//인스턴스 변수는 초기화가 false이므로 출력 안됨
		ctv.caption = true;
		ctv.displayCaption("Hello JAVA....");		//변수를 true로 변경 후 출력 확인
		
		System.out.println("ctv.power : " + ctv.power);		//부모 파워 호출
		
		System.out.println("ctv.getChannel : " + ctv.getChannel());		//getChannel 메소드를 통해 부모 채널 호출
	}

}
