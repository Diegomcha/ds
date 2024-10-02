/*
 * IMPORTANT: The code provided for this practice is the minimum necessary to
 * understand the exercise and should NEVER be taken as an example of the
 * proper use of exceptions, assertions and tests. All of the above, which
 * should be done in a real program, has been omitted on purpose to simplify
 * the approach to the exercise.
 */

package main;

import editor.core.Editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Editor editor = new Editor();

        simulateMouse(editor);
    }

    public static void simulateMouse(Editor editor) throws IOException {

        System.out.println("\nTools selection: rectangle | circle | triangle | selection");
        System.out.println("mouse actions: click x,y | drag x,y | drop x,y");
        System.out.println("Other commands: draw | exit \n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(editor.getPrompt() + "> ");
            String[] line = in.readLine().split("[ ,]");

            if (line[0].equals("exit"))
                return;

            // $ Click on tools buttons -----------------------------

            if (line[0].startsWith("rec"))
                editor.clickToolButton("rectangle");

            else if (line[0].startsWith("cir"))
                editor.clickToolButton("circle");

            else if (line[0].startsWith("tri"))
                editor.clickToolButton("triangle");

            else if (line[0].startsWith("sel"))
                editor.clickToolButton("selection");

                // $ Mouse actions -----------------------------

            else if (line[0].startsWith("cli"))
                editor.click(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("drag"))
                editor.drag(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("dro"))
                editor.drop(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

                // $ other commands -----------------------------

            else if (line[0].startsWith("draw"))
                editor.draw();

            else
                System.out.println("Invalid command");

        } while (true);
    }

}
