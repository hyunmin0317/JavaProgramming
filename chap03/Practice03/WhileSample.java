package chap03.Practice03;
import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double sum = 0;
		int i = 0;
		while ((i = sc.nextInt()) != 0) {
			sum += i;
			n++;
		}
		System.out.println("�Էµ� ���� ������" +n +"�� �̸� ����� " + sum / n + "�Դϴ�.");
		sc.close();
	}
}