package Practice04;
// 예제4-6 : 가비지 발생
public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a = null;	//가비지 발생
		d = c;
		c = null;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}