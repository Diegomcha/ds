package editor.figure;

import editor.util.Point;

public class Circle implements Figure {
	
	private final Point centerPoint;
	private final int radius;
	
	public Circle(Point centerPoint, int radius) {
		this.centerPoint = centerPoint;
		this.radius = radius;
	}
	
	@Override
	public void translate(Point startPoint, Point endPoint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isClickInside(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}

}
