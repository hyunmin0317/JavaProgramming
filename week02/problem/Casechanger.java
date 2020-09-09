package Problem02;

import java.util.Scanner;

public class Casechanger {
	public static void main(String[] args) {
		char A;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력: ");
		A = sc.next().charAt(0);
		//Scanner를 통해 String형으로 문자를 받고 charAt을 통해 0번째 인덱스의 char형 문자를 A에 저장
		a = (int) A;											//문자 A를 int형으로 강제형변환하여 A의 ASCII코드를 a에 저장
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {	//입력받은 문자가 영문자일때
			if (a >= 65 && a <= 90)								//입력받은 문자가 대문자일때 소문자로 변환
				a += 32;
			else												//입력받은 문자가 소문자일때 대문자로 변환
				a -= 32;
			A = (char) a;
			System.out.println(A);
		}
		else													//입력받은 문자가 영문자가 아닐때
			System.out.println("영문자가 아닙니다.");
		sc.close();
	}
}