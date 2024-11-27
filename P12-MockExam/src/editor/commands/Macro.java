package editor.commands;

import java.util.ArrayList;
import java.util.List;

import editor.Content;

/**
 * Command / Composite
 */
public class Macro implements Command {

	private final List<Command> cmds = new ArrayList<>();
	
	@Override
	public void execute(Content content) {
		for (Command cmd: cmds)
			cmd.execute(content);
	}
	
	public void addCmd(Command cmd) {
		cmds.add(cmd);
	}

}
