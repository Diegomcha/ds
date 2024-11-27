package editor.handler;

import editor.Content;
import editor.commands.Command;

public class ExecHandler implements Handler {

	private final Content content;
	
	public ExecHandler(Content content) {
		this.content = content;
	}
	
	@Override
	public void handle(Command cmd) {
		cmd.execute(this.content);
	}

}
