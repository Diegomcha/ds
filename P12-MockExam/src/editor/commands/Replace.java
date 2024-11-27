package editor.commands;

import java.util.regex.Pattern;

import editor.Content;

/**
 * Command
 */
public class Replace implements Command {

	private final String replaceStr;
	private final String replaceWith;
	
	public Replace(String replaceStr, String replaceWith) {
		this.replaceStr = replaceStr;
		this.replaceWith = replaceWith;
	}
	
	@Override
	public void execute(Content content) {
		content.setText(new StringBuilder(
				content.getText().toString().replaceAll(Pattern.quote(this.replaceStr), this.replaceWith)));
	}

}
