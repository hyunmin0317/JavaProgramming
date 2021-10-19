package answers.assignment05;

import java.awt.Point;

public class Trapezoid extends Shape {
	public Trapezoid(String type, Point[] points) {
		super(type, points);
	}

	@Override
	public double calArea() {
		double w1, w2, height;
		w1 = Math.abs(points[3].x-points[0].x);
		w2 = Math.abs(points[1].x-points[2].x);
		height = Math.abs(points[0].y-points[1].y);
		return (w1+w2)*height/2;
	}

}
