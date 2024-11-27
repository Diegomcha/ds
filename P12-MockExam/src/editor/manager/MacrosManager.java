package editor.manager;

import java.util.HashMap;
import java.util.Map;

import editor.Editor;
import editor.commands.Macro;
import editor.handler.ExecHandler;
import editor.handler.MacroHandler;

public class MacrosManager {
	private final Editor editor;
	
	public MacrosManager(Editor editor) {
		this.editor = editor;
	}
	
	// Creation

	private String name;
	private Macro macro;
	
	public void startRecording(String name) {
		this.name = name;
		this.macro = new Macro();
		this.editor.setActiveHandler(new MacroHandler(macro));
	}
	
	public void stopRecording() {
		this.macros.put(name, macro);
		this.editor.setActiveHandler(new ExecHandler(editor.getContent()));
	}
	
	// Storage

	private final Map<String, Macro> macros = new HashMap<>();

	public Macro get(String name) {
		return this.macros.get(name);
	}
	
	public boolean has(String name) {
		return this.macros.containsKey(name);
	}
}
