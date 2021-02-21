package chap02.Practice02;

import java.util.Scanner;

public class Practice02_10 {
	public static void main(String[] args) {
		String grade;
		Scanner sc = new Scanner(System.in);
		grade = sc.next();
		
		switch (grade) {
		case "A":
		case "B":
			System.out.println("�� ���Ͽ����ϴ�.");
			break;
		case "C":
		case "D":
			System.out.println("�� �� ����ϼ���.");
			break;
		case "F":
			System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			break;
		default:
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
			break;
		}
		sc.close();
	}
}