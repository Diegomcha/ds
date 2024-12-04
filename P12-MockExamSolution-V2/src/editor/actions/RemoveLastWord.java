package editor.actions;

import editor.Document;

public class RemoveLastWord implements Action {
	@Override
	public void execute(Document document) {
		document.removeLastWord();
	}

	@Override
	public String toString() {
		return "Remove";
	}
}
