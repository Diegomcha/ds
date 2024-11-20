package figures.circle;

import java.awt.Point;

import editor.core.Figure;

public class Circle implements Figure {

	private Point centre;
	private int radius;

	public Circle(Point centre, int radius) {
		this.centre = centre;
		this.radius = radius;
	}

	public void draw() {
		System.out.println("  - Circle: centre = " + centre + ", radius = " + radius);
	}

	public boolean contains(int x, int y) {
		double distance = Math.sqrt(Math.pow(x - centre.x, 2) + Math.pow(y - centre.y, 2));
		return distance < radius;
	}

	public void move(int dx, int dy) {
		centre.translate(dx, dy);
	}

	@Override
	public String toString() {
		return "Circle: centre = " + centre + ", radius = " + radius;
	}
}
