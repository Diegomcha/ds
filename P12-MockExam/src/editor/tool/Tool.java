package editor.tool;

import editor.commands.Command;

public interface Tool {
	void handle(Command cmd);
}
