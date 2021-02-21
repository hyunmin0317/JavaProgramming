package chap03.Practice03;
import java.util.Scanner;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		System.out.print("�������� �Է�: ");
		dividend = sc.nextInt();
		System.out.print("�������� �Է�: ");
		divisor = sc.nextInt();
		try {
			System.out.println(dividend+"��" +divisor+"�� ������ ���� "
		+dividend/divisor+"�Դϴ�.");
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}		
		sc.close();
	}
}