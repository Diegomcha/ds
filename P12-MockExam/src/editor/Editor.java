package editor;

import editor.commands.Command;
import editor.handler.ExecHandler;
import editor.handler.Handler;
import editor.manager.MacrosManager;

public class Editor {

	// Content
	
	private final Content content = new Content();

	public Content getContent() {
		return this.content;
	}
	
	// Handlers

	private Handler activeHandler = new ExecHandler(this.getContent());

	public void setActiveHandler(Handler handler) {
		this.activeHandler = handler;
	}

	public void run(Command cmd) {
		this.activeHandler.handle(cmd);
	}

	// Managers

	private final MacrosManager macros = new MacrosManager(this);

	public MacrosManager getMacros() {
		return this.macros;
	}
}
