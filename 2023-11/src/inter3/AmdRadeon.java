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
	
	//제조자
	@Override
	public String company() {
		return this.company;
	}
	
	//모델
	@Override
	public String model() {
		return this.model;
	}
	
	//메모리
	@Override
	public int memory() {
		return this.memory;
	}
	
	//출력
	@Override
	public void write(PointColor pc) {
		
	}
}
