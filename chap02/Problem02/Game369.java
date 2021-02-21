package chap02.Problem02;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		if (num%10==3 || num%10==6 || num%10==9)	//���� num 1�� �ڸ��� 3, 6, 9�� �ϳ��϶�
			count++;
		if (num/10==3 || num/10==6 || num/10==9)	//���� num 10�� �ڸ��� 3, 6, 9�� �ϳ��϶�
			count++;
		
		if (count==1)	//3, 6, 9�� 1�� ������
			System.out.println("�ڼ�¦");
		if (count==2)	//3, 6, 9�� 2�� ������
			System.out.println("�ڼ�¦¦");
		sc.close();
	}
}