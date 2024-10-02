package editor.core;

import editor.tool.SelectionTool;
import editor.tool.Tool;
import editor.tool.figure.CircleTool;
import editor.tool.figure.RectangleTool;
import editor.tool.figure.TriangleTool;
import editor.util.Point;

/**
 * The Editor class is responsible for managing the editor's state, drawings and tools.
 */
public class Editor {

    private final Drawing drawing;
    private Tool tool;

    /**
     * Create a new instance of the Editor.
     */
    public Editor() {
        // Just manages one drawing
        drawing = new Drawing();
        // Select default tool
        this.clickToolButton("default");
    }

    // $ UI related methods -----------------------------------------

    /**
     * Draw the current drawing.
     */
    public void draw() {
        System.out.println(drawing.draw());
    }

    /**
     * Click event on a tool button.
     *
     * @param toolName The name of the tool button.
     */
    public void clickToolButton(String toolName) {
        this.tool = switch (toolName) {
            case "triangle" -> new TriangleTool(this);
            case "rectangle" -> new RectangleTool(this);
            case "circle" -> new CircleTool(this);
            default -> new SelectionTool(this);
        };
    }

    /**
     * Click event on the drawing area.
     *
     * @param x The x-coordinate of the click.
     * @param y The y-coordinate of the click.
     */
    public void click(int x, int y) {
        this.tool.click(new Point(x, y));
    }

    /**
     * Drag event on the drawing area.
     *
     * @param x The x-coordinate of the drag.
     * @param y The y-coordinate of the drag.
     */
    public void drag(int x, int y) {
        this.tool.drag(new Point(x, y));
    }

    /**
     * Drop event on the drawing area.
     *
     * @param x The x-coordinate of the drop.
     * @param y The y-coordinate of the drop.
     */
    public void drop(int x, int y) {
        this.tool.drop(new Point(x, y));
    }

    /**
     * Gets the prompt for the active tool.
     *
     * @return The prompt for the active tool.
     */
    public String getPrompt() {
        return this.tool.getPrompt();
    }

    // $ Getters ----------------------------------------------------

    /**
     * Gets the active drawing of the editor.
     *
     * @return The active drawing.
     */
    public Drawing getDrawing() {
        return drawing;
    }

}
