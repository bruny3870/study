package inter3;

public interface GraphicsCard {
	//������
	public abstract String company();
	//��
	public String model();				//abstract ����
	//�޸�
	public int memory();				//abstract ����
	//����
	public void write(PointColor pc);	//abstract ����
}
