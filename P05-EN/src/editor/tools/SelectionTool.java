package editor.tools;

import java.awt.Point;

import editor.core.*;
import editor.history.change.MoveFigureChange;

public class SelectionTool implements Tool {

    private EditorWindow editor;

    private Figure selected;
    private Point lastPosition;
    private Point firstPosition;

    public SelectionTool(EditorWindow editor) {
        this.editor = editor;
    }

    public void mousePressed(int x, int y) {
        selected = editor.getDrawing().getFigura(x, y);
        lastPosition = new Point(x, y);
        firstPosition = new Point(x, y);
    }

    public void mouseMoved(int x, int y) {
        mueveIncremento(x, y);
    }

    public void mouseReleased(int x, int y) {
        mueveIncremento(x, y);
        editor.addChange(new MoveFigureChange(selected, lastPosition.x - firstPosition.x, lastPosition.y - firstPosition.y));
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
    	return "Selection Tool->"+selected;
    }

}
