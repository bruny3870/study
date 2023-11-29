package inter3;

public class GraphicsCardMain {
	
	//운영체제에서 그래픽 출력
	public void opratingSystemWrite(GraphicsCard gc, PointColor pc) {		//다형성 -> gc 로 Nvidia 와 Amd 호출 가능
		if (gc != null) {
			System.out.println("그래픽 카드 출력");
			System.out.println("회사명 : " + gc.company());
			System.out.println("모델명 : " + gc.model());
			System.out.println("메모리 : " + gc.memory());
			gc.write(pc);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 예제
		//라데온 그래픽 카드 생성
		GraphicsCard amd = new AmdRadeon("Rx 5000", 4096);
		
		//엔비디아 그래픽 카드 생성
		NvidiaGeForce nvi = new NvidiaGeForce("Geforce GT 710", 2048);
		
		//포인트 컬러 생성
		PointColor pc = new PointColor();
		pc.setX(100);
		pc.setY(200);
		pc.setRgb(new Rgb(255, 128, 100));		//Rgb객체 생성으로 주소값 넘김
		
		//그래픽카드 메인 객체 생성
		GraphicsCardMain gcm = new GraphicsCardMain();
		gcm.opratingSystemWrite(amd, pc);
		
		System.out.println();
		
		gcm.opratingSystemWrite(nvi, pc);
	}

}
