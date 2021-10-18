package assignments.assignment05;

import java.awt.Point;

public class Parallelogram extends Shape {
	// 생성자
	public Parallelogram(String type, Point[] points) {
		super(type, points);
	}

	// 평행사변형의 넓이를 구하는 함수
	@Override
	double calArea() {
		return (points[3].x-points[0].x)*(points[0].y-points[1].y);
	}

}
