package editor.handler;

import editor.commands.Command;
import editor.commands.Macro;

public class MacroHandler implements Handler {
	
	private final Macro macro;

	public MacroHandler(Macro macro) {
		this.macro = macro;
	}

	@Override
	public void handle(Command cmd) {
		this.macro.addCmd(cmd);
	}
}
