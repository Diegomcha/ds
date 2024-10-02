package editor.tool.figure;

import editor.core.Editor;
import editor.figure.Circle;
import editor.figure.Figure;
import editor.util.Point;

/**
 * The CircleTool class is responsible for creating a circle figure.
 */
public class CircleTool extends FigureTool {

    /**
     * Create a new instance of the CircleTool.
     *
     * @param editor The editor which will make use of the tool.
     */
    public CircleTool(Editor editor) {
        super(editor);
    }

    @Override
    protected Figure createFigure(Point startPoint, Point endPoint) {
        return new Circle(startPoint, (int) Math.round(Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2))));
    }

}
