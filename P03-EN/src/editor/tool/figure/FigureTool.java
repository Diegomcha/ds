package editor.tool.figure;

import editor.core.Editor;
import editor.figure.Figure;
import editor.tool.Tool;
import editor.util.Point;

public abstract class FigureTool implements Tool {
	
	private final Editor editor;
	private Point startPoint;
	
	protected FigureTool(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void click(Point p) {
		this.startPoint = p;
	}
	
	@Override
	public void drop(Point p) {
		this.editor.getDrawing().addFigure(this.createFigure(startPoint, p));
		// TODO: Select default tool
	}
	
	protected abstract Figure createFigure(Point startPoint, Point endPoint);
}
