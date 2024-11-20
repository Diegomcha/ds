package figures.circle;

import java.awt.Point;

import editor.core.EditorWindow;
import editor.core.Figure;
import editor.tools.CreationalTool;

public class CircleTool extends CreationalTool {

	public CircleTool(EditorWindow editor) {
		super(editor);
	}

	protected Figure doCreateFigure(Point begin, Point end) {
		Point centre = new Point((begin.x + end.x) / 2, (begin.y + end.y) / 2);
		int radius = Math.max(end.x - begin.x, end.y - begin.y) / 2;
		return new Circle(centre, radius);
	}

	public String toString() {
		return "Circle Tool";
	}

}
