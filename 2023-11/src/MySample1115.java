import java.util.Scanner;

class Data {
	int x;
	int y;
}

public class MySample1115 {
	/*
	//�⺻�� �Ű�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();	//��ü ����
		d.x = 10;
		
		System.out.println("main() x : " + d.x);
		
//		MySample1115 m = new MySample1115();	//change �޼��尡 static �� �ƴ� ��� Ŭ���� ��ü ���� �� ȣ��
//		m.change(d.x);
		
		change(d.x);	//���� Ŭ���� ���� �޼��� �־ �տ� Ŭ���� �̸� ����
		
		System.out.println("main() after x : " + d.x);
	}
	
	//�⺻�� �Ű�����
	//void change(int x) {
	static void change(int x) {		//�޼��� ����, �Ű����� �⺻�� (int x) => �� ������ => ���� ����
		x = 1000;
		
		System.out.println("change() x : " + x);
	}
	*/
	
	/*
	//������ �Ű�����
	public static void main(String[] args) {
		Data d = new Data();	//��ü ����
		d.x = 10;
		
		System.out.println("main() x : " + d.x);
		
		change(d);
		
		System.out.println("main() x after : " + d.x);
	}
	
	static void change(Data d) {	//�޼��� ����, �Ű����� ������ (Data d) => �ּ� ������ => ���� ����
		d.x = 1000;
		
		System.out.println("change() x : " + d.x);
	}
	*/
	
	/*
	//������ ��ȯŸ��(����Ÿ��)
	public static void main(String[] args) {
		Data d = new Data();	//��ü ����
		d.x = 10;
		
		Data d2 = change(d);
		
		System.out.println("d.x  = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	
	static Data change(Data d) {	//change �޼��� ����Ÿ�� -> ������ , �Ű����� -> ������ 
		//main d �� change d �� ���� �ּ�
		Data tmp = new Data();	//��ü ����
		tmp.x = d.x;	//d �� �ٸ� �ּ� ����
		//tmp.x = 2000;
		
		return tmp;
	}
	*/
	
	/*
	//�⺻�� �Ű�����, ������ ��ȯŸ��(����Ÿ��)
	public static void main(String[] args) {
		int a = 5;
		Data d;
		
		System.out.println("main() a : " + a);
		
		d = change(a);
		
		System.out.println("main() after d.x " + d.x);
	}
	
	static Data change(int a) {		//change �޼��� ����Ÿ�� -> ������, �Ű����� -> �⺻��
		Data tmp = new Data();	//��ü ����
		tmp.x = a + 10;
		
		return tmp;
	}
	*/
	
	/*
	 ����) Data ��ü�� y������ �߰��ϰ� main���� 2�� ������ �Է¹޾� Data ��ü �� ������ �����ϰ�, main���� �� ���� ��� �� �� 
	 	  copy �޼��带 ���� ���� 2�� ���� ����� ����ϴ� ���α׷�
	 �Է� ��) ���� 2���� �Է��ϼ��� => 10 20
	 ��� ��) main�Է� d.x : 10, d.y : 20
	 		copy�ż��� d.x : 10, d.y : 20
	 		copy�ż��� tmp.x : 20, tmp.y : 40
	 		main������ d.x : 10, d.y : 20
	 		main������ d2.x : 20 d2.y ; 40
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data d = new Data();
		
		System.out.print("���� 2���� �Է��ϼ��� => ");
		d.x = sc.nextInt();
		d.y = sc.nextInt();
		
		System.out.println("main�Է� d.x : " + d.x + ", d.y : " + d.y);
		
		Data d2 = copy(d);
		
		System.out.println("main������ d.x : " + d.x + ", d.y : " + d.y);
		System.out.println("main������ d2.x : " + d2.x + ", d2.y : " + d2.y);
		
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		
		tmp.x = d.x * 2;
		tmp.y = d.y * 2;
		
		System.out.println("copy�ż��� d.x : " + d.x + ", d.y : " + d.y);
		System.out.println("copy�ż��� tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
		
		return tmp;
		
	}
	*/
	
	/*
	 ����) �� ������ �����ϳ� �ٸ� ���
	 ��) copy �޼��� ��ȯŸ��(����Ÿ��) ����
	 �Է� ��) ���� 2���� �Է��ϼ��� => 10 20
	 ��� ��) main�Է� d.x : 10, d.y : 20
	 		copy�ż��� tmp.x : 10, tmp.y : 20
	 		copy�ż��� tmp.x : 20, tmp.y : 40
	 		main������ d.x : 20, d.y : 40
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data d = new Data();
		
		System.out.print("���� 2���� �Է��ϼ��� => ");
		d.x = sc.nextInt();
		d.y = sc.nextInt();
		
		System.out.println("main�Է� d.x : " + d.x + ", d.y : " + d.y);
		
		copy(d);
		
		System.out.println("main������ d.x : " + d.x + ", d.y : " + d.y);
		
	}
	
	static void copy(Data tmp) {	//tmp �� d ���� �ּ�
		System.out.println("copy�ż��� tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
		
		tmp.x = tmp.x * 2;
		tmp.y = tmp.y * 2;
		
		System.out.println("copy�ż��� tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
	}
	*/
	
	/*
	//�迭�� �̿��� ������ �Ű�����
	public static void main(String[] args) {
		int[] a = {10, 20};
		
		System.out.println("main() a[0] : " + a[0]);
		
		change(a);
		
		System.out.println("main() after a[0] : " + a[0]);
	}
	
	static void change(int[] x) {
		x[0] = 2000;
		
		System.out.println("change() x[0] : " + x[0]);
	}
	*/
	
	/*
	 ����) �迭�� {3, 2, 1, 6, 5, 4}�� �ʱⰪ���� ���� �Ŀ� ������������ �����Ͽ� ����ϴ� ���α׷�
	 ��) �� �޼���� �迭��� printArr, �迭�� sumArr, �迭���� sortArr ����
	 	sumArr �޼��常 ���� ����
	 ��� ��) [3, 2, 1, 6, 5, 4]
	 		[1, 2, 3, 4, 5, 6]
	 		sum = 21
	 */
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 6, 5, 4};
		
		printArr(a);
		sortArr(a);
		printArr(a);
		
		System.out.println("sum = " + sumArr(a));
	}
	
	static void printArr(int[] x) {
		int i;
		
		System.out.print("[");
		
		for (i = 0; i < x.length; i++) {
			System.out.print(x[i]);
			
			if(i != x.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("] \n");
	}
		
	static void sortArr(int[] x) {
		int i, j;
		int tmp;
		
		for (i = 0; i < x.length - 1; i++) {
			for (j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
	}
	
	static int sumArr(int[] x) {
		int i;
		int sum = 0;
		
		for (i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		
		return sum;
	}
	
}
