package Problem02;

import java.util.Scanner;

public class CompareCircle {
	public static void main(String[] args) {
		int x1, y1, r1;		//원1 중심의 좌표와 반지름
		int x2, y2, r2;		//원2 중심의 좌표와 반지름
		double distance;	//두 원의 중심 사이의 거리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
	
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		//두 원의 중심 사이의 거리를 그함

		if (distance <= r1+r2)		//두 원의 중심 사이의 거리보다 두 원 반지름의 합이 더 크거나 같을때
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안겹친다.");
		sc.close();
	}
}