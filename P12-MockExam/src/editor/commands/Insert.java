package editor.commands;

import editor.Content;

/**
 * Command
 */
public class Insert implements Command {

	private final String[] args;
	
	public Insert(String[] args) {
		this.args = args.clone();
	}
	
	@Override
	public void execute(Content content) {
		for (int i = 1; i < this.args.length; i++)
			content.getText().append(this.args[i] + " ");
	}

}
