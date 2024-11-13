package editor.tools;

import java.awt.Point;

import editor.changes.MovementChange;
import editor.core.EditorWindow;
import editor.core.Figure;
import editor.core.Tool;

public class SelectionTool implements Tool {

	private EditorWindow editor;

	private Figure selected;
	private Point lastPosition;
	private Point init;

	public SelectionTool(EditorWindow editor) {
		this.editor = editor;
	}

	public void mousePressed(int x, int y) {
		selected = editor.getDrawing().getFigura(x, y);
		init = lastPosition = new Point(x, y);
	}

	public void mouseMoved(int x, int y) {
		mueveIncremento(x, y);
	}

	public void mouseReleased(int x, int y) {
		mueveIncremento(x, y);

		if (selected != null)
			editor.addChange(new MovementChange(selected, lastPosition.x - init.x, lastPosition.y - init.y));

		selected = null;
	}

	private void mueveIncremento(int x, int y) {
		if (selected != null) {
			selected.move(x - lastPosition.x, y - lastPosition.y);
			lastPosition = new Point(x, y);
		}
	}

	public String toString() {
		if (selected == null)
			return "Selection Tool";
		return "Selection Tool->" + selected;
	}

}
