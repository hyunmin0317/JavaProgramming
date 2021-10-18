package assignments.assignment05;

import java.awt.Point;

public abstract class Shape {
	String type;
	Point[] points;
	
	// 생성자
	public Shape(String type, Point[] points) {
		this.type = type;
		this.points = points;
	}
	
	abstract double calArea();	// 도형의 넓이를 구하는 함수
	
	// 도형의 각 꼭지점 좌표와 면적을 화면에 출력
	public String toString() {
		String result = "";
		result += type + "\n";
		for (int i=0; i<points.length; i++)
			result += "P"+i+": "+points[i]+"\n";
		result += "area: " + calArea() + "\n";
		return result;
	}
}
