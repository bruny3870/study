package inter3;

public class NvidiaGeForce implements GraphicsCard {
	private String company;
	private String model;
	private int memory;
	
	public NvidiaGeForce(String model, int memory) {
		company = "NVIDIA";
		this.model = model;
		this.memory = memory;
	}
	
	//������
	@Override
	public String company() {
		return this.company;
	}
	
	//��
	@Override
	public String model() {
		return this.model;
	}
	
	//�޸�
	@Override
	public int memory() {
		return this.memory;
	}
	
	//���
	@Override
	public void write(PointColor pc) {
		if (pc != null) {
			Rgb rgb = pc.getRgb();
			System.out.println("---" + company + "GraphicsCard ���");
			System.out.println("1. ��ǥ�� ���Ѵ�.");
			System.out.println("x : " + pc.getX());
			System.out.println("y : " + pc.getY());
			System.out.println("2. color ����");
			
			if (rgb != null) {
				System.out.println("Red : " + rgb.getRed());
				System.out.println("Green : " + rgb.getGreen());
				System.out.println("Blue : " + rgb.getBlue());
			}
			
			//�ٸ����
//			if (pc.getRgb() != null) {
//				System.out.println("Red : " + pc.getRgb().getRed());
//				System.out.println("Green : " + pc.getRgb().getGreen());
//				System.out.println("Blue : " + pc.getRgb().getBlue());
//			}
			
			System.out.println("3. ����� ��ǥ�� ���� ���");
		}
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
}
