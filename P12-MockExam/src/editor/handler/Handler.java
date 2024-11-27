package editor.handler;

import editor.commands.Command;

public interface Handler {
	void handle(Command cmd);
}
