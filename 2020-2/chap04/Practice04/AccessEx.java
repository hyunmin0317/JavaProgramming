package chap04.Practice04;
// ���� 4-7 : ���� �������� ���
class Sample {
	public int a;
	private int b;
	int c;
	protected int d;
	void changeB(int b) {
		this.b = b;
	}
	int getB() {
		return b;
	}
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.changeB(10);;
		aClass.c = 10;
		aClass.d = 10;
		System.out.println("a: "+aClass.a);
		System.out.println("b: "+aClass.getB());
		System.out.println("c: "+aClass.c);
		System.out.println("d: "+aClass.d);
	}
}