package chap02.Practice02;

import java.util.Scanner;

public class Practice02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���.");
		System.out.println("����� ���̴� "+ sc.nextInt() + "���Դϴ�.");
		System.out.println("����� ü���� "+ sc.nextDouble() + "kg�Դϴ�.");
		System.out.println("����� ������ "+ sc.nextDouble() + "cm�Դϴ�.");
		sc.close();
	}
}