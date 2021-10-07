import java.awt.Point;

public class RightTriangle extends Shape {
	// 생성자
	public RightTriangle(String type, Point[] points) {
		super(type, points);
	}

	// 직각삼각형의 넓이를 구하는 함수
	@Override
	double calArea() {
		return (points[2].x-points[1].x)*(points[0].y-points[2].y)/2;
	}

}
