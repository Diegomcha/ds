package editor.ui;

import java.io.*;
import java.util.Arrays;

import editor.Editor;

public class EditorTextUI {
	private static BufferedReader in;
	private Editor editor;

	public EditorTextUI(Editor editor) {
		if (editor == null)
			throw new IllegalArgumentException("The UI needs a reference to the editor");
		this.editor = editor;
	}

	public void run() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Actions");
		System.out.println("--------");
		System.out.println("open <file>");
		System.out.println("inseert <text>\t\t// insert the words at the end of the text");
		System.out.println("remove\t\t\t// remove the last word");
		System.out.println("replace <a> <b>\t\t// replace the string <a> with the string <b> throughout the text");
		System.out.println("exit");
		System.out.println();
		System.out.println("Tasks");
		System.out.println("------");
		System.out.println("record <macroName>\t// starts a macro recording called 'macroName'");
		System.out.println("stop\t\t\t// ends the current macro recording");
		System.out.println("execute <macro>\t\t// executes the macro named 'macroName'");
		System.out.println();

		do {
			System.out.print("> ");

			String[] line = in.readLine().split(" ");

			// It is not verified that the number of words is adequate

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("open")) {
				editor.open(line[1]);
			} else if (line[0].startsWith("ins")) {
				String[] wordsToAppend = Arrays.copyOfRange(line, 1, line.length);
				editor.insert(wordsToAppend);
			} else if (line[0].startsWith("rem")) {
				editor.removeLastWord();
			} else if (line[0].startsWith("rep")) {
				editor.replace(line[1], line[2]);
			} else if (line[0].startsWith("rec")) {
				editor.recordMacro(line[1]);
			} else if (line[0].startsWith("stop")) {
				editor.stop();
			} else if (line[0].startsWith("exe")) {
				editor.executeMacro(line[1]);
			} else {
				System.out.println("Unknown instruction");
			}

			System.out.println(editor.getDocument().getText());
		} while (true);
	}
}
