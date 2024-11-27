package editor.commands;

import editor.Editor;

/**
 * Command
 */
public class Insert implements Command {

	private final String[] args;
	
	public Insert(String[] args) {
		this.args = args.clone();
	}
	
	@Override
	public void execute(Editor editor) {
		for (int i = 1; i < this.args.length; i++)
			editor.getContent().getText().append(this.args[i] + " ");
	}

}
