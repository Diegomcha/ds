package editor.tool;

import editor.Editor;
import editor.commands.Command;

public class ExecTool implements Tool {

	private final Editor editor;
	
	public ExecTool(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void handle(Command cmd) {
		cmd.execute(editor);
	}

}
