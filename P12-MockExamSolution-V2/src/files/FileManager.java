package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
	public StringBuilder readFile (String filename) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(filename));
			String line;
			StringBuilder result = new StringBuilder();
			while ((line = input.readLine()) != null) {
				result.append(line);
			}
			input.close();
			return result;
		} catch (IOException e) {
			System.out.printf("The file '%s' could not be opened: %s", filename, e.getMessage());
			return null;
		}
	}
}
