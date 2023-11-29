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
		if (pc != null) {
			Rgb rgb = pc.getRgb();
			
			System.out.println("---" + company + "GraphicsCard 출력");
			System.out.println("1. color를 구성한다.");
			
			if (rgb != null) {
				System.out.println("Blue : " + rgb.getBlue());		//pc.getRgb().getBlue()
				System.out.println("Red : " + rgb.getRed());		//pc.getRgb().getRed()
				System.out.println("Green : " + rgb.getGreen());	//pc.getRgb().getGreen()
			}
			
			System.out.println("2. 좌표를 구한다.");
			System.out.println("x : " + pc.getX());
			System.out.println("y : " + pc.getY());
			System.out.println("3. 여기서 모니터 좌표에 색상 출력");
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
