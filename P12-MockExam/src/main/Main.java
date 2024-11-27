package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import editor.Editor;
import editor.commands.Insert;
import editor.commands.Open;
import editor.commands.RemoveLastWord;
import editor.commands.Replace;

public class Main {
	private static BufferedReader in;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Actions");
		System.out.println("--------");
		System.out.println("open <file>");
		System.out.println("insert <text>\t\t// insert the words at the end of the text");
		System.out.println("remove\t\t\t// remove the last word");
		System.out.println("replace <a> <b>\t// replace the string <a> with the string <b> throughout the text");
		System.out.println("exit");
		System.out.println();
		System.out.println("Tasks");
		System.out.println("------");
		System.out.println("record <macroName>\t\t// starts a macro recording called macroName");
		System.out.println("stop\t\t\t// ends the current macro recording");
		System.out.println("execute <macro>\t\t// executes the macro named macroName");
		System.out.println();
		
		Editor editor = new Editor();
		
		do {
			System.out.print("> ");

			String[] line = in.readLine().split(" ");

			// It is not verified that the number of words is adequate

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("open")) {
				editor.run(new Open(line[1]));
			} else if (line[0].startsWith("ins")) {
				editor.run(new Insert(line));
			} else if (line[0].startsWith("rem")) {
				editor.run(new RemoveLastWord());
			} else if (line[0].startsWith("rep")) {
				editor.run(new Replace(line[1], line[2]));
			} else if (line[0].startsWith("rec")) {
				editor.getMacros().startRecording(line[1]);
			} else if (line[0].startsWith("stop")) {
				editor.getMacros().stopRecording();
			} else if (line[0].startsWith("exe")) {
				if (!editor.getMacros().has(line[1]))
					System.out.println("Macro does not exist");
				else editor.run(editor.getMacros().get(line[1]));
			} else {
				System.out.println("Unknown instruction");
			}

			System.out.println(editor.getContent().getText());

		} while (true);
	}
}
