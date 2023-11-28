package inter3;

public class PointColor {
	//xÁÂÇ¥°ª
	private int x;
	//yÁÂÇ¥°ª
	private int y;
	//RGB»ö»óÇ¥
	private Rgb rgb;		//Rgb °´Ã¼ ÇÊ¿ä
	
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
