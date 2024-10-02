package editor.core;

public class Editor {

    private Drawing drawing;

    public Editor() {
        drawing = new Drawing();

    }

    public void draw() {
        // Drawing menu
        // Drawing the lateral tool bar
        // Drawing the context line
        drawing.draw();
    }

    // $ Methods from the user interface -----------------------------

    // Click the tool button to activate it
    public void clickToolButton(String toolName) {
        // ?
    }

    public void pinchar(int x, int y) {
        // ?
    }

    public void mover(int x, int y) {
        // ?
    }

    public void soltar(int x, int y) {
        // ?
    }

    // $ Drawing Methods -----------------------------

    public Drawing getDrawing() {
        return drawing;
    }

}
