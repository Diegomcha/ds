package main;

import java.io.*;
import java.util.regex.*;

public class Main {
	private static BufferedReader in;
	private static StringBuilder text;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		text = new StringBuilder("");

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

		do {
			System.out.print("> ");

			String[] line = in.readLine().split(" ");

			// It is not verified that the number of words is adequate

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("open")) {
				text = readFile(line[1]);
			} else if (line[0].startsWith("ins")) {
				for (int i = 1; i < line.length; i++) {
					text.append(line[i] + " ");
				}
			} else if (line[0].startsWith("rem")) {
				int indexOfLastWord = text.toString().trim().lastIndexOf(" ");
				if (indexOfLastWord == -1)
					text = new StringBuilder("");
				else
					text.setLength(indexOfLastWord + 1);
			} else if (line[0].startsWith("rep")) {
				text = new StringBuilder(text.toString().replaceAll(Pattern.quote(line[1]), line[2]));
			} else if (line[0].startsWith("rec")) {
				;
			} else if (line[0].startsWith("stop")) {
				;
			} else if (line[0].startsWith("exe")) {
				;
			} else {
				System.out.println("Unknown instruction");
			}

			System.out.println(text);

		} while (true);
	}

	static StringBuilder readFile(String filename) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}
}
