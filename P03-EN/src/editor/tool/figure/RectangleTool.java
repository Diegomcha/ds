package editor.tool.figure;

import editor.core.Editor;
import editor.figure.Figure;
import editor.figure.Rectangle;
import editor.util.Point;

/**
 * The RectangleTool class is responsible for creating a rectangle figure.
 */
public class RectangleTool extends FigureTool {

    /**
     * Create a new instance of the RectangleTool.
     *
     * @param editor The editor which will make use of the tool.
     */
    public RectangleTool(Editor editor) {
        super(editor);
    }

    @Override
    protected Figure createFigure(Point startPoint, Point endPoint) {
        return new Rectangle(startPoint, endPoint.getX() - startPoint.getX(), endPoint.getY() - startPoint.getY());
    }

}
