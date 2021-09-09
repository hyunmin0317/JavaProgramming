package chap02.Problem02;

import java.util.Scanner;

public class CompareNum {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("2�ڸ� ����(10~99)�� �Է��ϼ���.");
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		if(num/10 == num%10)	//2�ڸ� ���� num�� 10�� �ڸ��� 1�� �ڸ� ���ڰ� ������
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		sc.close();
	}
}