package editor.tool.figure;

import editor.core.Editor;
import editor.figure.Figure;
import editor.figure.Triangle;
import editor.util.Point;

/**
 * The TriangleTool class is responsible for creating a triangle figure.
 */
public class TriangleTool extends FigureTool {

    private Point intermediateVertex;

    /**
     * Create a new instance of the TriangleTool.
     *
     * @param editor The editor which will make use of the tool.
     */
    public TriangleTool(Editor editor) {
        super(editor);
    }

    @Override
    public void drag(Point p) {
        this.intermediateVertex = p;
    }

    @Override
    protected Figure createFigure(Point startPoint, Point endPoint) {
        return new Triangle(startPoint, intermediateVertex, endPoint);
    }

}
