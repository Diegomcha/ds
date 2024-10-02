package editor.tool.figure;

import editor.core.Editor;
import editor.figure.Figure;
import editor.tool.Tool;
import editor.util.Point;

abstract class FigureTool implements Tool {

    private final Editor editor;
    private Point startPoint;

    protected FigureTool(Editor editor) {
        this.editor = editor;
    }

    @Override
    public String getPrompt() {
        return this.getClass().getSimpleName();
    }

    @Override
    public final void click(Point p) {
        this.startPoint = p;
    }

    @Override
    public void drag(Point p) {
        // Do nothing
    }

    @Override
    public final void drop(Point p) {
        this.editor.getDrawing().addFigure(this.createFigure(startPoint, p));
        this.editor.clickToolButton("default");
    }

    protected abstract Figure createFigure(Point startPoint, Point endPoint);
}
