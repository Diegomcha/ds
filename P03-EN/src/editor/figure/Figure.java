package editor.figure;

import editor.util.Point;

/**
 * The Figure interface represents a figure that can be drawn on the screen.
 */
public interface Figure {

    /**
     * Move the figure using the translation of the provided points.
     *
     * @param startPoint The starting point of the translation.
     * @param endPoint   The ending point of the translation.
     */
    void move(Point startPoint, Point endPoint);

    /**
     * Check if the provided point is inside the figure.
     *
     * @param p The point to check.
     * @return True if the point is inside the figure, false otherwise.
     */
    boolean isClickInside(Point p);

    /**
     * Draws the figure.
     *
     * @return The "drawing" (String representation) of the figure.
     */
    String draw();
}
