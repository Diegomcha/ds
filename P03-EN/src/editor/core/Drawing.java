package editor.core;

import java.util.ArrayList;
import java.util.List;

import editor.figure.Figure;
import editor.util.Point;

/**
 * The Drawing class represents a drawing that contains figures.
 */
public class Drawing {

	private final List<Figure> figures = new ArrayList<>();
	private Figure selectedFigure;

	/**
	 * Add a figure to the drawing.
	 *
	 * @param fig The figure to add.
	 */
	public void addFigure(Figure fig) {
		this.figures.add(fig);
	}

	/**
	 * Select the figure at the given point if a figure is present.
	 *
	 * @param p The point to check.
	 * @return True if a figure is selected, false otherwise.
	 */
	public boolean selectFigure(Point p) {
		for (Figure figure : figures.reversed())
			if (figure.isClickInside(p)) {
				this.selectedFigure = figure;
				return true;
			}

		return false;
	}

	/**
	 * Deselect the currently selected figure.
	 */
	public void deselectFigure() {
		this.selectedFigure = null;
	}

	/**
	 * Get the currently selected figure.
	 *
	 * @return The currently selected figure.
	 */
	public Figure getSelectedFigure() {
		return this.selectedFigure;
	}

	/**
	 * Draw the drawing.
	 *
	 * @return The "drawing" (String representation) of the drawing.
	 */
	public String draw() {
		StringBuilder representation = new StringBuilder();

		for (Figure figure : figures)
			representation.append("\t").append(figure.draw()).append("\n");

		return representation.toString();
	}
}
