package editor.history.change;

import editor.core.Figure;

public class MoveFigureChange implements Change {

	private final Figure fig;
	private int dx, dy;

	/**
	 * Creates a MoveFigureChange.
	 * 
	 * @param fig Figure that was moved.
	 * @param dx  X coordinate of the destination.
	 * @param dy  Y coordinate of the destination.
	 */
	public MoveFigureChange(Figure fig, int dx, int dy) {
		this.fig = fig;
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public void undo() {
		fig.move(-dx, -dy);
	}

	@Override
	public void redo() {
		fig.move(dx, dy);
	}

}
