package Problem02;

import java.util.Scanner;

public class IncludeCircle {
	public static void main(String[] args) {
		double x1, y1, r;	//원 중심의 좌표와 반지름
		double x2, y2;		//점의 좌표
		double distance;	//원 중심의 좌표와 점의 좌표의 거리
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>> ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		r = sc.nextDouble();
	
		System.out.print("점 입력>> ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		//원 중심의 좌표와 점의 좌표의 거리를 구함

		System.out.print("점 ("+x2+", "+y2+")는 ");
		if (distance <= r)	//원 중심의 좌표와 점의 좌표의 거리보다 반지름의 길이가 더 크거나 같을때
			System.out.println("원 안에 있다.");
		else
			System.out.println("원 밖에 있다.\"");
		sc.close();
	}
}