package chap02.Problem02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int a, b, c;		//�ﰢ�� 3���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���.");
		System.out.print("����1: ");
		a = sc.nextInt();
		System.out.print("����2: ");
		b = sc.nextInt();
		System.out.print("����3: ");
		c = sc.nextInt();
		
		if((a+b)<=c || (a+c)<=b || (b+c)<=a)	//� �κ� ������ ���� �ٸ� �Ѻ����� �۰ų� ������
			System.out.println("�ﰢ�� ������ ���̰� �� �� �����ϴ�.");
		else
			System.out.println("�ﰢ�� ������ ���̰� �� �� �ֽ��ϴ�.");
		sc.close();
	}
}