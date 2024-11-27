package editor.manager;

import java.util.HashMap;
import java.util.Map;

import editor.Editor;
import editor.commands.Macro;
import editor.tool.ExecTool;
import editor.tool.MacroTool;

public class MacrosManager {
	private final Map<String, Macro> macros = new HashMap<>();
	private final Editor editor;
	
	private String name;
	private Macro macro;

	public MacrosManager(Editor editor) {
		this.editor = editor;
	}
	
	// Creation
	
	public void startRecording(String name) {
		this.name = name;
		this.macro = new Macro();
		this.editor.setActiveTool(new MacroTool(macro));
	}
	
	public void stopRecording() {
		this.macros.put(name, macro);
		this.editor.setActiveTool(new ExecTool(editor));
	}
	
	// Storage
	
	public Macro get(String name) {
		return this.macros.get(name);
	}
	
	public boolean has(String name) {
		return this.macros.containsKey(name);
	}
}
