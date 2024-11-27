package editor.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import editor.Editor;

/**
 * Command
 */
public class Open implements Command {

	private final String filename;
	
	public Open(String filename) throws FileNotFoundException {
		if (!new File(filename).exists())
			throw new FileNotFoundException("Provided file does not exist");
		
		this.filename = filename;
	}
	
	@Override
	public void execute(Editor editor) {
		editor.getContent().setText(readFile(this.filename));
	}

	private StringBuilder readFile(String filename) {
		try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
			StringBuilder result = new StringBuilder();
			
			String line;
			while ((line = input.readLine()) != null)
				result.append(line);
			
			return result;
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
