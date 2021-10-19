package answers.assignment05;

import java.awt.Point;

public class Parallelogram extends Shape {
	public Parallelogram(String type, Point[] points) {
		super(type, points);
	}

	@Override
	public double calArea() {
		return Math.abs(points[3].x-points[0].x)*Math.abs(points[0].y-points[1].y);
	}

}
