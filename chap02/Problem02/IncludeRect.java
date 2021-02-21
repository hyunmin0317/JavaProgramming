package chap02.Problem02;

import java.util.Scanner;

public class IncludeRect {
	public static void main(String[] args) {
		int x, y;	//���� ��ǥ
		Scanner sc = new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��ϼ���.");
		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();

		if((x>=100 && x<=200) || (y>=100 && y<=200))  // x�� y�� ���� 100~200 ���� �ȿ� �����Ҷ�
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		else
			System.out.println("�簢�� �ȿ� ���� �����ϴ�.");
		sc.close();
	}
}