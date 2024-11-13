package editor.changes;

import editor.core.Change;
import editor.core.Drawing;
import editor.core.Figure;

public class CreationChange implements Change {

	private Figure figure;
	private Drawing drawing;

	public CreationChange(Drawing drawing, Figure figure) {
		this.figure = figure;
		this.drawing = drawing;
	}

	public void undo() {
		drawing.removeFigura(figure);
	}

	public void redo() {
		drawing.addFigura(figure);
	}

}
