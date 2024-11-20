package figures.rectangle;

import java.awt.Point;

import editor.core.EditorWindow;
import editor.core.Figure;
import editor.tools.CreationalTool;

public class RectangleTool extends CreationalTool {

	public RectangleTool(EditorWindow editor) {
		super(editor);
	}

	protected Figure doCreateFigure(Point begin, Point end) {
		return new Rectangle(begin, end);
	}

	public String toString() {
		return "Rectangle Tool";
	}

}
