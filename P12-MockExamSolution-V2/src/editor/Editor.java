package editor;

import editor.actions.*;
import files.FileManager;

public class Editor {
	private Document document = new Document();
	private FileManager fileManager = new FileManager();
	private ActionManager actionManager = new ActionManager(this);

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	public FileManager getFileManager() {
		return fileManager;
	}

	public void open(String filename) {
		actionManager.execute(new Open(filename, fileManager));
	}

	public void insert(String[] wordsToBeInserted) {
		actionManager.execute(new Insert(wordsToBeInserted));
	}

	public void removeLastWord() {
		actionManager.execute(new RemoveLastWord());
	}

	public void replace(String source, String destination) {
		actionManager.execute(new Replace(source, destination));
	}

	public void recordMacro(String name) {
		actionManager.recordMacro(name);
	}

	public void stop() {
		actionManager.stop();
	}

	public void executeMacro(String name) {
		actionManager.executeMacro(name);
	}
}
