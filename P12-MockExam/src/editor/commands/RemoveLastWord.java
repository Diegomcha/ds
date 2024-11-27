package editor.commands;

import editor.Content;

/**
 * Command
 */
public class RemoveLastWord implements Command {

	@Override
	public void execute(Content content) {
		int indexOfLastWord = content.getText().toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			content.setText(new StringBuilder(""));
		else
			content.getText().setLength(indexOfLastWord + 1);
	}

}
