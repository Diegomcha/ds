package editor;

import java.util.HashMap;
import java.util.Map;

import editor.actions.Action;
import editor.actions.Macro;

public class ActionManager {
	private Editor editor;
	private boolean recordingMacro;
	private Macro macro;
	private Map<String, Macro> macros = new HashMap<>();

	public ActionManager(Editor editor) {
		if (editor == null)
			throw new IllegalArgumentException("A reference to the editor is needed");
		this.editor = editor;
	}

	public void execute(Action action) {
		action.execute(editor.getDocument());
		if (recordingMacro)
			macro.addAction(action);
	}

	public void recordMacro(String name) {
		macro = new Macro(name);
		recordingMacro = true;
	}

	public void stop() {
		if (!recordingMacro)
			return;
		recordingMacro = false;
		macros.put(macro.getName(), macro);
	}

	public void executeMacro(String name) {
		Macro currentMacro = macros.get(name);
		if (currentMacro == null) {
			System.out.println("There is no macro with this name: " + name);
			return;
		}
		execute(currentMacro);
	}
}
