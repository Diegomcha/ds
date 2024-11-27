package editor.commands;

import editor.Editor;

/**
 * Command
 */
public class RemoveLastWord implements Command {

	@Override
	public void execute(Editor editor) {
		int indexOfLastWord = editor.getContent().getText().toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			editor.getContent().setText(new StringBuilder(""));
		else
			editor.getContent().getText().setLength(indexOfLastWord + 1);
	}

}
