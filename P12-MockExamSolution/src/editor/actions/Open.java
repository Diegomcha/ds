package editor.actions;

import java.io.*;

import editor.Editor;

public class Open implements Action {
	private String filename;

	public Open(String filename) {
		if (filename == null || filename.trim().length() == 0)
			throw new IllegalArgumentException("The action of opening a file needs the name of the file!");
		this.filename = filename;
	}

	@Override
	public void execute(Editor editor) {
		try {
			editor.setText(readFile(filename));
		} catch (IOException e) {
			System.out.printf("The file '%s' could not be opened: %s", filename, e.getMessage());
		}
	}

	private StringBuilder readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}

	@Override
	public String toString() {
		return "Open " + filename;
	}
}
