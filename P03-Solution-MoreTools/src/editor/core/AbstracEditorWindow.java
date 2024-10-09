package editor.core;

import java.util.*;

public abstract class AbstracEditorWindow {

    private Drawing drawing;
    private Map<String, Tool> tools;
    private Tool tool;
    private Tool selection;

    public AbstracEditorWindow() {
        drawing = new Drawing();

        tools = new HashMap<>();
        doCreaHerramientas(tools);
        tool = selection = tools.get("selection");
    }

    protected abstract void doCreaHerramientas(Map<String, Tool> tools);

//    protected void doCreaHerramientas(Map<String, Tool> tools) {
//        tools.put("rectangle", new RectangleTool(this));
//        tools.put("circle", new CircleTool(this));
//        tools.put("triangle", new TriangleTool(this));
//        tools.put("selection", new SelectionTool(this));
//    }

    // $ User interface methods -----------------------------

    public void toolButtonClicked(String name) {
        setTool(tools.get(name));
    }

    public void mousePressed(int x, int y) {
        tool.mousePressed(x, y);
    }

    public void mouseMoved(int x, int y) {
        tool.mouseMoved(x, y);
    }

    public void mouseReleased(int x, int y) {
        tool.mouseReleased(x, y);
    }

    // $ Tools Methods ---------------------

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void finHerramienta() {
        tool = selection;
    }

    public Tool getTool() {
        return tool;
    }

    // $ Drawing methods -----------------------------

    public Drawing getDrawing() {
        return drawing;
    }

    public void dibujar() {

        drawing.dibuja();

        System.out.println("  [" + tool + " active]");
        System.out.println();
    }

}
