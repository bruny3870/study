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
		
	}
}
