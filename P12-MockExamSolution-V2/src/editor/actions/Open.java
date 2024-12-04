package editor.actions;

import editor.Document;
import files.FileManager;

public class Open implements Action {
	private String filename;
	private FileManager fileManager;

	public Open(String filename, FileManager fileManager) {
		if (filename == null || filename.trim().length() == 0)
			throw new IllegalArgumentException("The action of opening a file needs the name of the file!");
		this.filename = filename;
		this.fileManager = fileManager;
	}

	@Override
	public void execute(Document document) {
		document.setText(fileManager.readFile(filename));
	}

	@Override
	public String toString() {
		return "Open " + filename;
	}
}
