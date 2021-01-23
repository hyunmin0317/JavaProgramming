package Problem05;
// 실습 05-04
abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y) {	// 생성자 생성
	    this.x = x; this.y = y;
	}
	protected abstract void move(int x, int y);	// 추상메소드 move 선언
	protected abstract void reverse();	// 추상메소드 reverse 선언
	protected void show() {	// 추상메소드 show 선언
	    System.out.print(x + ", "+ y);
	}
}

public class MyColorPoint extends MyPoint{
	String c;
	public MyColorPoint(int x, int y, String c) {
		super(x, y);
		this.c = c;
	}
	public void move(int x, int y) {	// 새로운 x, y 위치로 이동
		this.x = x;
		this.y = y;
	}
	public void reverse() {	// (x, y)에서 (y, x)로 위치 변경
		int z = x;
		x = y;
		y = z;
	}
	public void show() {	//저장된 좌표를 출력
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