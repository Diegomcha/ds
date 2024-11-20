package editor.figure;

import editor.util.Point;

/**
 * The Circle class represents a circle figure.
 */
public class Circle implements Figure {

	private final Point center;
	private final int radius;

	/**
	 * Create a new circle.
	 *
	 * @param center The center of the circle.
	 * @param radius The radius of the circle.
	 */
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public void move(Point startPoint, Point endPoint) {
		this.center.translate(endPoint.getX() - startPoint.getX(), endPoint.getY() - startPoint.getY());
	}

	@Override
	public boolean isClickInside(Point p) {
		double distance = Math
				.sqrt(Math.pow(p.getX() - this.center.getX(), 2) + Math.pow(p.getY() - this.center.getY(), 2));
		return distance < radius;
	}

	@Override
	public String draw() {
		return "Circle[center=" + center.toString() + ", radius=" + this.radius + "]";
	}

}
