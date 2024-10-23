package figures.triangle;

import java.awt.Point;

import editor.changes.CreationChange;
import editor.core.*;

public class TriangleTool implements Tool {
    public TriangleTool(EditorWindow editor) {
        this.editor = editor;
    }

    public void mousePressed(int x, int y) {
        vertice[vertices++] = new Point(x, y);
        if (vertices == 3) {
            Figure figure = new Triangle(vertice[0], vertice[1], vertice[2]);
            editor.getDrawing().addFigura(figure);
            editor.addChange(new CreationChange(editor.getDrawing(), figure));
            vertices = 0;
            editor.endTool();
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
