package Problem02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int a, b, c;		//삼각형 3변의 길이
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요.");
		System.out.print("정수1: ");
		a = sc.nextInt();
		System.out.print("정수2: ");
		b = sc.nextInt();
		System.out.print("정수3: ");
		c = sc.nextInt();
		
		if((a+b)<=c || (a+c)<=b || (b+c)<=a)	//어떤 두변 길이의 합이 다른 한변보다 작거나 같을때
			System.out.println("삼각형 세변의 길이가 될 수 없습니다.");
		else
			System.out.println("삼각형 세변의 길이가 될 수 있습니다.");
		sc.close();
	}
}