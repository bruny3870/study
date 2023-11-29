package inter3;

public interface GraphicsCard {
	//제조사
	public abstract String company();
	//모델
	public String model();				//abstract 생략
	//메모리
	public int memory();				//abstract 생략
	//츌력
	public void write(PointColor pc);	//abstract 생략
}
