package Practice03;
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			if(sc.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자의 개수는 "+ num +"개이다.");
		sc.close();
	}
}