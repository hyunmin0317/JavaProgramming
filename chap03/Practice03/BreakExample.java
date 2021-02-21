package chap03.Practice03;
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
		System.out.println("�Էµ� ������ ������ "+ num +"���̴�.");
		sc.close();
	}
}