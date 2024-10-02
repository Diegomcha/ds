package editor.tool;

import editor.core.Editor;
import editor.figure.Figure;
import editor.util.Point;

/**
 * The SelectionTool class is responsible for selecting and moving figures.
 */
public class SelectionTool implements Tool {

    private final Editor editor;
    private Point startPoint;

    /**
     * Create a new instance of the SelectionTool.
     *
     * @param editor The editor which will make use of the tool.
     */
    public SelectionTool(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void click(Point p) {
        if (this.editor.getDrawing().getSelectedFigure() == null && this.editor.getDrawing().selectFigure(p))
            this.startPoint = p;
    }

    @Override
    public void drag(Point p) {
        Figure fig = this.editor.getDrawing().getSelectedFigure();
        if (fig != null) {
            fig.move(startPoint, p);
            this.startPoint = p;
        }
    }

    @Override
    public void drop(Point p) {
        this.drag(p);
        this.editor.getDrawing().deselectFigure();
    }

    @Override
    public String getPrompt() {
        StringBuilder builder = new StringBuilder(this.getClass().getSimpleName());

        Figure fig = this.editor.getDrawing().getSelectedFigure();
        if (fig != null)
            builder.append(" -> ").append(fig.draw());

        return builder.toString();
    }

}
