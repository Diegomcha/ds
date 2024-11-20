package figures.triangle;

import java.awt.Point;

import editor.core.EditorWindow;
import editor.core.Figure;
import editor.core.Tool;

public class TriangleTool implements Tool {
	public TriangleTool(EditorWindow editor) {
		this.editor = editor;
	}

	public void mousePressed(int x, int y) {
		vertice[vertices++] = new Point(x, y);
		if (vertices == 3) {
			Figure figura = new Triangle(vertice[0], vertice[1], vertice[2]);
			editor.getDrawing().addFigura(figura);
			vertices = 0;
			editor.finHerramienta();
		}
	}

	public void mouseMoved(int x, int y) {
		// Do nothing
	}

	public void mouseReleased(int x, int y) {
		// Do nothing
	}

	public String toString() {
		return "Triangle Tool";
	}

	private int vertices = 0;
	private Point[] vertice = new Point[3];
	private EditorWindow editor;
}
