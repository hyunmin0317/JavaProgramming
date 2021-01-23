package Problem02;

import java.util.Scanner;

public class IncludeRect {
	public static void main(String[] args) {
		int x, y;	//점의 좌표
		Scanner sc = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하세요.");
		System.out.print("x: ");
		x = sc.nextInt();
		System.out.print("y: ");
		y = sc.nextInt();

		if((x>=100 && x<=200) || (y>=100 && y<=200))  // x와 y의 값이 100~200 범위 안에 존재할때
			System.out.println("사각형 안에 점이 있습니다.");
		else
			System.out.println("사각형 안에 점이 없습니다.");
		sc.close();
	}
}