package inter3;

public class AmdRadeon implements GraphicsCard {
	
	private String company;
	private String model;
	private int memory;
	
	public AmdRadeon(String model, int memory) {
		this.company = "AMD";
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
			System.out.println("1. color�� �����Ѵ�.");
			
			if (rgb != null) {
				System.out.println("Blue : " + rgb.getBlue());		//pc.getRgb().getBlue()
				System.out.println("Red : " + rgb.getRed());		//pc.getRgb().getRed()
				System.out.println("Green : " + rgb.getGreen());	//pc.getRgb().getGreen()
			}
			
			System.out.println("2. ��ǥ�� ���Ѵ�.");
			System.out.println("x : " + pc.getX());
			System.out.println("y : " + pc.getY());
			System.out.println("3. ���⼭ ����� ��ǥ�� ���� ���");
		}
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
}
