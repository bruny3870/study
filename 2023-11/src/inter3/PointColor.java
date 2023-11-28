package inter3;

public class PointColor {
	//x��ǥ��
	private int x;
	//y��ǥ��
	private int y;
	//RGB����ǥ
	private Rgb rgb;		//Rgb ��ü �ʿ�
	
	public PointColor() {
		this(0, 0, new Rgb());
	}
	
	public PointColor(int x, int y, Rgb rgb) {
		this.x = x;
		this.y = y;
		this.rgb = rgb;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Rgb getRgb() {
		return this.rgb;
	}
	
	public void setRgb(Rgb rgb) {
		this.rgb = rgb;
	}
}
