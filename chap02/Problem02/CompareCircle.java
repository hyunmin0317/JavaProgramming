package chap02.Problem02;

import java.util.Scanner;

public class CompareCircle {
	public static void main(String[] args) {
		int x1, y1, r1;		//��1 �߽��� ��ǥ�� ������
		int x2, y2, r2;		//��2 �߽��� ��ǥ�� ������
		double distance;	//�� ���� �߽� ������ �Ÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
	
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		//�� ���� �߽� ������ �Ÿ��� ����

		if (distance <= r1+r2)		//�� ���� �߽� ������ �Ÿ����� �� �� �������� ���� �� ũ�ų� ������
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� �Ȱ�ģ��.");
		sc.close();
	}
}