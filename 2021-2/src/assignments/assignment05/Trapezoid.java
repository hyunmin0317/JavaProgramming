import java.awt.Point;

public class Trapezoid extends Shape {
	// 생성자
	public Trapezoid(String type, Point[] points) {
		super(type, points);
	}

	// 사다리꼴의 넓이를 구하는 함수
	@Override
	double calArea() {
		return ((points[3].x-points[0].x)+(points[1].x-points[2].x))*(points[0].y-points[1].y)/2;
	}

}
