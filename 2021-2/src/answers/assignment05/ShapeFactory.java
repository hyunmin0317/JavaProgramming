package answers.assignment05;

import java.awt.Point;

public interface ShapeFactory {
	Shape create(String type, Point[] points);
}
