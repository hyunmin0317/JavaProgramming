package Problem02;

import java.util.Scanner;

public class CompareNum {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 정수(10~99)를 입력하세요.");
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		if(num/10 == num%10)	//2자리 정수 num의 10의 자리와 1의 자리 숫자가 같을때
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		sc.close();
	}
}