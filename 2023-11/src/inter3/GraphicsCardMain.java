package inter3;

public class GraphicsCardMain {
	
	//�ü������ �׷��� ���
	public void opratingSystemWrite(GraphicsCard gc, PointColor pc) {		//������ -> gc �� Nvidia �� Amd ȣ�� ����
		if (gc != null) {
			System.out.println("�׷��� ī�� ���");
			System.out.println("ȸ��� : " + gc.company());
			System.out.println("�𵨸� : " + gc.model());
			System.out.println("�޸� : " + gc.memory());
			gc.write(pc);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� ����
		//�󵥿� �׷��� ī�� ����
		GraphicsCard amd = new AmdRadeon("Rx 5000", 4096);
		
		//������ �׷��� ī�� ����
		NvidiaGeForce nvi = new NvidiaGeForce("Geforce GT 710", 2048);
		
		//����Ʈ �÷� ����
		PointColor pc = new PointColor();
		pc.setX(100);
		pc.setY(200);
		pc.setRgb(new Rgb(255, 128, 100));		//Rgb��ü �������� �ּҰ� �ѱ�
		
		//�׷���ī�� ���� ��ü ����
		GraphicsCardMain gcm = new GraphicsCardMain();
		gcm.opratingSystemWrite(amd, pc);
		
		System.out.println();
		
		gcm.opratingSystemWrite(nvi, pc);
	}

}
