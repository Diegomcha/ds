package editor.tools;

import java.awt.Point;

import editor.changes.CreationChange;
import editor.core.*;

public abstract class CreationalTool implements Tool {

    protected EditorWindow editor;
    private Point begin;
    private Point end;

    protected CreationalTool(EditorWindow editor) {
        this.editor = editor;
    }

    public void mousePressed(int x, int y) {
        begin = new Point(x, y);
    }

    public void mouseMoved(int x, int y) {
        // Do nothing
    }

    public void mouseReleased(int x, int y) {
        end = new Point(x, y);
        Figure figure = doCreateFigure(begin, end);
        editor.getDrawing().addFigura(figure);
        
        editor.addChange(new CreationChange(editor.getDrawing(), figure));

        editor.endTool();
    }

    protected abstract Figure doCreateFigure(Point begin, Point end);

}
