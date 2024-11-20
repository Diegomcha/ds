package editor.figure;

import editor.util.Point;

/**
 * The Triangle class represents a triangle figure.
 */
public class Triangle implements Figure {

	private final Point corner1, corner2, corner3;

	/**
	 * Create a new triangle.
	 *
	 * @param corner1 The first corner of the triangle.
	 * @param corner2 The second corner of the triangle.
	 * @param corner3 The third corner of the triangle.
	 */
	public Triangle(Point corner1, Point corner2, Point corner3) {
		this.corner1 = corner1;
		this.corner2 = corner2;
		this.corner3 = corner3;
	}

	@Override
	public void move(Point startPoint, Point endPoint) {
		int diffX = endPoint.getX() - startPoint.getX();
		int diffY = endPoint.getY() - startPoint.getY();

		corner1.translate(diffX, diffY);
		corner2.translate(diffX, diffY);
		corner3.translate(diffX, diffY);
	}

	@Override
	public boolean isClickInside(Point p) {
		return p.equals(corner1) || p.equals(corner2) || p.equals(corner3);
	}

	@Override
	public String draw() {
		return "Triangle[corner1=" + corner1.toString() + ", corner2=" + corner2.toString() + ", corner3="
				+ corner3.toString() + "]";
	}
}
