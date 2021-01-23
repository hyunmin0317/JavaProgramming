package Problem02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int x1, y1; 	//점1의 좌표
		int x2, y2;		//점2의 좌표
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점 (x1,y1)의 좌표를 입력하세요.");
		System.out.print("x1: ");
		x1 = sc.nextInt();
		System.out.print("y1: ");
		y1 = sc.nextInt();
		System.out.println("점 (x2,y2)의 좌표를 입력하세요.");
		System.out.print("x2: ");
		x2 = sc.nextInt();
		System.out.print("y2: ");
		y2 = sc.nextInt();

		if ((x1<50 && x2<50) || (x1>100 && x2>100) || (y1<50 && y2<50) || (y1>100 && y2>100))
			System.out.println("사각형이 안 겹칩니다.");
		else
			System.out.println("사각형이 겹칩니다.");
		sc.close();
	}
}