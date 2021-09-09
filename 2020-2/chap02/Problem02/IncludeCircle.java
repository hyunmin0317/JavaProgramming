package chap02.Problem02;

import java.util.Scanner;

public class IncludeCircle {
	public static void main(String[] args) {
		double x1, y1, r;	//�� �߽��� ��ǥ�� ������
		double x2, y2;		//���� ��ǥ
		double distance;	//�� �߽��� ��ǥ�� ���� ��ǥ�� �Ÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		r = sc.nextDouble();
	
		System.out.print("�� �Է�>> ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		//�� �߽��� ��ǥ�� ���� ��ǥ�� �Ÿ��� ����

		System.out.print("�� ("+x2+", "+y2+")�� ");
		if (distance <= r)	//�� �߽��� ��ǥ�� ���� ��ǥ�� �Ÿ����� �������� ���̰� �� ũ�ų� ������
			System.out.println("�� �ȿ� �ִ�.");
		else
			System.out.println("�� �ۿ� �ִ�.\"");
		sc.close();
	}
}