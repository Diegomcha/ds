package editor.commands;

import java.util.ArrayList;
import java.util.List;

import editor.Editor;

/**
 * Command / Composite
 */
public class Macro implements Command {

	private final List<Command> cmds = new ArrayList<>();
	
	@Override
	public void execute(Editor editor) {
		for (Command cmd: cmds)
			editor.run(cmd);
	}
	
	public void addCmd(Command cmd) {
		cmds.add(cmd);
	}

}
