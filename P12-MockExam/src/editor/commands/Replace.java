package editor.commands;

import java.util.regex.Pattern;

import editor.Editor;

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
	public void execute(Editor editor) {
		editor.getContent().setText(new StringBuilder(editor.getContent().getText().toString().replaceAll(Pattern.quote(this.replaceStr), this.replaceWith)));
	}

}
