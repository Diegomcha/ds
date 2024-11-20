package editor.figure;

import editor.util.Point;

/**
 * The Rectangle class represents a rectangle figure.
 */
public class Rectangle implements Figure {

	private final Point corner;
	private final int width;
	private final int height;

	/**
	 * Create a new rectangle.
	 *
	 * @param corner The top-left corner of the rectangle.
	 * @param width  The width of the rectangle.
	 * @param height The height of the rectangle.
	 */
	public Rectangle(Point corner, int width, int height) {
		this.corner = corner;
		this.width = width;
		this.height = height;
	}

	@Override
	public void move(Point startPoint, Point endPoint) {
		this.corner.translate(endPoint.getX() - startPoint.getX(), endPoint.getY() - startPoint.getY());
	}

	@Override
	public boolean isClickInside(Point p) {
		return (this.corner.getX() <= p.getX() && p.getX() <= this.corner.getX() + this.width)
				&& (this.corner.getY() <= p.getY() && p.getY() <= this.corner.getY() + this.height);
	}

	@Override
	public String draw() {
		return "Rectangle[corner=" + this.corner.toString() + ", width=" + this.width + ", height=" + this.height + "]";
	}

}
