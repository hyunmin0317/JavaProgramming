package Practice02;

import java.util.Scanner;

public class Practice02_08 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		num = sc.nextInt();
		
		if (num % 3 == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		sc.close();
	}
}