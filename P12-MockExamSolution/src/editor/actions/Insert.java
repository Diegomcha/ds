package editor.actions;

import editor.Editor;

public class Insert implements Action {
	private StringBuilder text = new StringBuilder();

	public Insert(String[] words) {
		if (words == null || words.length == 0)
			throw new IllegalArgumentException("At least one word to insert is needed");
		for (String word : words) {
			text.append(word + " ");
		}
	}

	@Override
	public void execute(Editor editor) {
		editor.setText(editor.getText().append(text));
	}

	@Override
	public String toString() {
		return "Insert " + text;
	}
}
