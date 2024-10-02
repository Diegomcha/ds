package editor.core;

import editor.tool.Tool;
import editor.util.Point;

public class Editor {

	private final Drawing drawing;
	private Tool activeTool;
	
	public Editor() {
		drawing = new Drawing();
	}

	public void draw() {
		// Drawing menu
		// Drawing the lateral tool bar
		// Drawing the context line
		drawing.draw();
	}
	
	public void useDefaultTool() {
		// TODO:
	}

	// $ Methods from the user interface -----------------------------

	// Click the tool button to activate it
	public void clickToolButton(String toolName) {
		// ?
	}

	public void click(int x, int y) {
		if (this.activeTool != null)
			this.activeTool.click(new Point(x, y));
	}

	public void drag(int x, int y) {
//		if (this.activeTool != null)
//			this.activeTool.drag(new Point(x, y));
	}

	public void drop(int x, int y) {
		if (this.activeTool != null)
			this.activeTool.drop(new Point(x, y));
	}

	// $ Drawing Methods -----------------------------

	public Drawing getDrawing() {
		return drawing;
	}

}
