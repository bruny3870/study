package inter;

//�������̽�
interface Providable {
	//�߻�޼ҵ�
	public abstract void leisureSports();		//����������
	public abstract void sightSeeling();		//����
	public abstract void food();				//����
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}
	
	@Override
	public void sightSeeling() {
		System.out.println("�溹�� ���� ����");
	}
	
	@Override
	public void food() {
		System.out.println("�Ұ�� ����");
	}
}

class TourGuide {
	private Providable tour = new KoreaTour();		//������
	
	//�������̵� �ƴ�
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
		//ĸ��, ���, ������ ��� ����
		TourGuide guide = new TourGuide();
		
		guide.leisureSports();
		guide.sightSeeling();
		guide.food();
	}

}
