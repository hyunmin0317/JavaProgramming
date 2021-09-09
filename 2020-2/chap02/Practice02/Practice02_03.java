package chap02.Practice02;

import java.util.Scanner;

public class Practice02_03 {
	public static void main(String[] args) {
		int time, second, minute, hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "���Դϴ�.");
		sc.close();
	}
}