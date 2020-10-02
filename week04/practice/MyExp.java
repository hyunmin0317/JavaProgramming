package Practice04;
import java.util.Scanner;
// 예제 4-2 : 지수 클래스 MyExp 만들기
public class MyExp {
	int base, exp;
	int getValue() {
		int sum = 1;
		for(int i = 0;i < exp;i++)
			sum *= base;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyExp ex = new MyExp();
		ex.base = sc.nextInt();
		ex.exp = sc.nextInt();
		System.out.println(ex.base+"의 "+ex.exp+"승 = "+ex.getValue());
		sc.close();
	}
}