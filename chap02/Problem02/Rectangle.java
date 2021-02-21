package chap02.Problem02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int x1, y1; 	//��1�� ��ǥ
		int x2, y2;		//��2�� ��ǥ
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� (x1,y1)�� ��ǥ�� �Է��ϼ���.");
		System.out.print("x1: ");
		x1 = sc.nextInt();
		System.out.print("y1: ");
		y1 = sc.nextInt();
		System.out.println("�� (x2,y2)�� ��ǥ�� �Է��ϼ���.");
		System.out.print("x2: ");
		x2 = sc.nextInt();
		System.out.print("y2: ");
		y2 = sc.nextInt();

		if ((x1<50 && x2<50) || (x1>100 && x2>100) || (y1<50 && y2<50) || (y1>100 && y2>100))
			System.out.println("�簢���� �� ��Ĩ�ϴ�.");
		else
			System.out.println("�簢���� ��Ĩ�ϴ�.");
		sc.close();
	}
}