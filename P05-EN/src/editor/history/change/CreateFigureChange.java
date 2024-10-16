package editor.history.change;

import editor.core.Drawing;
import editor.core.Figure;

public class CreateFigureChange implements Change {

	private final Drawing drawing;
	private final Figure fig;

	/**
	 * Creates a CreateFigureChange.
	 * 
	 * @param drawing Drawing in which the figure was created.
	 * @param fig     Figure that was created.
	 */
	public CreateFigureChange(Drawing drawing, Figure fig) {
		this.drawing = drawing;
		this.fig = fig;
	}

	@Override
	public void undo() {
		drawing.removeFigura(fig);
	}

	@Override
	public void redo() {
		drawing.addFigura(fig);
	}

}
