package editor.util;

/**
 * The Point class represents a point in a 2D space.
 */
public class Point {

	private int x;
	private int y;

	/**
	 * Create a new point.
	 *
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get the x coordinate of the Point.
	 *
	 * @return The x coordinate of the Point.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get the y coordinate of the Point.
	 *
	 * @return The y coordinate of the Point.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Translate the point by the given amount.
	 *
	 * @param diffX The amount to translate the x coordinate by.
	 * @param diffY The amount to translate the y coordinate by.
	 */
	public void translate(int diffX, int diffY) {
		this.x += diffX;
		this.y += diffY;
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Point point))
			return false;

		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}
