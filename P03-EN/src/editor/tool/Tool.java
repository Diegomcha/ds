package editor.tool;

import editor.util.Point;

/**
 * The Tool interface is responsible for defining the methods that a tool must
 * implement.
 */
public interface Tool {

	/**
	 * Mouse click event.
	 *
	 * @param p The point where the click event occurred.
	 */
	void click(Point p);

	/**
	 * Mouse drag event.
	 *
	 * @param p The point where the mouse was dragged to.
	 */
	void drag(Point p);

	/**
	 * Mouse drop event.
	 *
	 * @param p The point where the drop event occurred.
	 */
	void drop(Point p);

	/**
	 * Get the prompt for the tool.
	 *
	 * @return The prompt for the tool.
	 */
	String getPrompt();

}
