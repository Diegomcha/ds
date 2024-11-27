package editor.commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import editor.Content;

/**
 * Command
 */
public class Open implements Command {

	private final String filename;
	
	public Open(String filename) throws FileNotFoundException {
		this.filename = filename;
	}
	
	@Override
	public void execute(Content content) {
		content.setText(readFile(this.filename));
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
