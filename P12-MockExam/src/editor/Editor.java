package editor;

import editor.commands.Command;
import editor.manager.MacrosManager;
import editor.tool.Tool;

public class Editor {

	// Content
	
	private final Content content = new Content();

	public Content getContent() {
		return this.content;
	}
	
	// Tools

	private Tool activeTool;

	public void setActiveTool(Tool tool) {
		this.activeTool = tool;
	}

	public void run(Command cmd) {
		this.activeTool.handle(cmd);
	}

	// Managers

	private final MacrosManager macros = new MacrosManager(this);

	public MacrosManager getMacros() {
		return this.macros;
	}
}
