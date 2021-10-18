package assignments.assignment05;

import java.awt.Point;

public class TriangularShapeFactory implements ShapeFactory {
	// 삼각형의 팩토리 메소드
	@Override
	public Shape create(String type, Point[] points) {
		Shape shape = null;
		if (type.equals("Triangle")) {
			shape = new Triangle(type, points);
		} else if (type.equals("RightTriangle")) {
			shape = new RightTriangle(type, points);
		}
		return shape;	
	}
}