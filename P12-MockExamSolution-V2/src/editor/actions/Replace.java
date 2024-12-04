package editor.actions;

import editor.Document;

public class Replace implements Action {
	private String source, destination;

	public Replace(String source, String destination) {
		if (source == null || destination == null)
			throw new IllegalArgumentException("The replace operation needs the source and destination string");
		this.source = source;
		this.destination = destination;
	}

	@Override
	public void execute(Document document) {
		document.replace(source, destination);
	}

	@Override
	public String toString() {
		return "Replace " + source + " by " + destination;
	}
}
