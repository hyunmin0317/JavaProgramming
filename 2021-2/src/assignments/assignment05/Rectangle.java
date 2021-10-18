package assignments.assignment05;

import java.awt.Point;

public class Rectangle extends Shape{
	// 생성자
	public Rectangle(String type, Point[] points) {
		super(type, points);
	}

	// 사각형의 넓이를 구하는 함수
	@Override
	double calArea() {
		return (points[1].x-points[0].x)*(points[0].y-points[1].y);
	}
}
