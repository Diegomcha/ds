package editor.tool;

import editor.commands.Command;
import editor.commands.Macro;

public class MacroTool implements Tool {
	
	private final Macro macro;

	public MacroTool(Macro macro) {
		this.macro = macro;
	}

	@Override
	public void handle(Command cmd) {
		this.macro.addCmd(cmd);
	}
}
