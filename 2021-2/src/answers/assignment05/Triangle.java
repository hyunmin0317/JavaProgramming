package answers.assignment05;

import java.awt.Point;

public class Triangle extends Shape {
	// 생성자
	public Triangle(String type, Point[] points) {
		super(type, points);
	}

	// 삼각형의 넓이를 구하는 함수
	@Override
	public double calArea() {
		double a, b, c, s;
		a = distance(points[0], points[1]);
		b = distance(points[1], points[2]);
		c = distance(points[2], points[0]);
		s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	// 두 점 사이의 거리를 구하는 함수 
	double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p2.x-p1.x, 2)+Math.pow(p2.y-p1.y, 2));
	}
	
	

}
