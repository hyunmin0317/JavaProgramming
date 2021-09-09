package chap05.Problem05;
// �ǽ� 05-04
abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y) {	// ������ ����
	    this.x = x; this.y = y;
	}
	protected abstract void move(int x, int y);	// �߻�޼ҵ� move ����
	protected abstract void reverse();	// �߻�޼ҵ� reverse ����
	protected void show() {	// �߻�޼ҵ� show ����
	    System.out.print(x + ", "+ y);
	}
}

public class MyColorPoint extends MyPoint{
	String c;
	public MyColorPoint(int x, int y, String c) {
		super(x, y);
		this.c = c;
	}
	public void move(int x, int y) {	// ���ο� x, y ��ġ�� �̵�
		this.x = x;
		this.y = y;
	}
	public void reverse() {	// (x, y)���� (y, x)�� ��ġ ����
		int z = x;
		x = y;
		y = z;
	}
	public void show() {	//����� ��ǥ�� ���
		super.show();
		System.out.println(", "+c);
	}
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(3, 2, "red");
		p.move(8, 7);
		p.reverse();
		p.show();
	}
}