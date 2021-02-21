package chap02.Practice02;

import java.util.Scanner;

public class Practice02_08 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		num = sc.nextInt();
		
		if (num % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		sc.close();
	}
}