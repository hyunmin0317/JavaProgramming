package assignments.assignment05;

import java.awt.Point;

public class RectangularShapeFactory implements ShapeFactory {
	// 사각형의 팩토리 메소드
	@Override
	public Shape create(String type, Point[] points) {
		Shape shape = null;
		if (type.equals("Rectangle")) {
			shape = new Rectangle(type, points);
		} else if (type.equals("Trapezoid")) {
			shape = new Trapezoid(type, points);
		} else if (type.equals("Parallelogram")) {
			shape = new Parallelogram(type, points);
		} 
		return shape;	
	}
}