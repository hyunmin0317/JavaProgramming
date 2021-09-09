package chap02.Problem02;

import java.util.Scanner;

public class Casechanger {
	public static void main(String[] args) {
		char A;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		A = sc.next().charAt(0);
		//Scanner�� ���� String������ ���ڸ� �ް� charAt�� ���� 0��° �ε����� char�� ���ڸ� A�� ����
		a = (int) A;											//���� A�� int������ ��������ȯ�Ͽ� A�� ASCII�ڵ带 a�� ����
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {	//�Է¹��� ���ڰ� �������϶�
			if (a >= 65 && a <= 90)								//�Է¹��� ���ڰ� �빮���϶� �ҹ��ڷ� ��ȯ
				a += 32;
			else												//�Է¹��� ���ڰ� �ҹ����϶� �빮�ڷ� ��ȯ
				a -= 32;
			A = (char) a;
			System.out.println(A);
		}
		else													//�Է¹��� ���ڰ� �����ڰ� �ƴҶ�
			System.out.println("�����ڰ� �ƴմϴ�.");
		sc.close();
	}
}