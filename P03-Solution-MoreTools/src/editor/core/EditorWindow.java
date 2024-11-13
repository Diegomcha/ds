package editor.core;

import java.util.Map;

import editor.tools.SelectionTool;
import figures.circle.CircleTool;
import figures.rectangle.RectangleTool;
import figures.triangle.TriangleTool;

public class EditorWindow extends AbstracEditorWindow {

	@Override
	protected void doCreaHerramientas(Map<String, Tool> tools) {
		tools.put("rectangle", new RectangleTool(this));
		tools.put("circle", new CircleTool(this));
		tools.put("triangle", new TriangleTool(this));
		tools.put("selection", new SelectionTool(this));
	}

}
