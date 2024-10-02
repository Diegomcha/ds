package editor.tool;

import editor.core.Editor;
import editor.figure.Figure;
import editor.util.Point;

public class SelectionTool implements Tool {

	private final Editor editor;
	private Point startPoint;
	
	public SelectionTool(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void click(Point p) {
		if (this.editor.getDrawing().selectFigure(p))
			this.startPoint = p;
	}

	@Override
	public void drop(Point p) {
		Figure fig = this.editor.getDrawing().getSelectedFigure();
		if (fig != null) {
			fig.translate(startPoint, p);
			this.editor.getDrawing().deselectFigure();
		}
	}

}
