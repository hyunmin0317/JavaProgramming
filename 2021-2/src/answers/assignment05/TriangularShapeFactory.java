package answers.assignment05;

import java.awt.Point;

public class TriangularShapeFactory implements ShapeFactory {
	@Override
	public Shape create(String type, Point[] points) {
		if (type.equals("Triangle")) {
			return new Triangle(type, points);
		} else if (type.equals("RightTriangle")) {
			return new RightTriangle(type, points);
		} else {
			return null;
		}
	}
}