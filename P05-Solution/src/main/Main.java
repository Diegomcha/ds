/*
 * IMPORTANT: The code provided for this practice is the minimum necessary to 
 * understand the exercise and should NEVER be taken as an example of the 
 * proper use of exceptions, assertions and tests. All of the above, which 
 * should be done in a real program, has been omitted on purpose to simplify 
 * the approach to the exercise.
 */

package main;

import java.io.*;

import editor.core.EditorWindow;

public class Main {

    public static void main(String[] args) throws IOException {

        EditorWindow editor = new EditorWindow();

        simulateMouse(editor);
    }

    public static void simulateMouse(EditorWindow editor) throws IOException {

        System.out.println("\nTools activation: rectangle | circle | triangle | selection");
        System.out.println("Mouse actions: click x,y | drag x,y | drop x,y");
        System.out.println("Undo Comands: undo | redo");
        System.out.println("Other commands: draw | exit \n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(editor.getTool() + "> ");
            String[] line = in.readLine().split("[ ,]");

            if (line[0].equals("exit"))
                return;

            // $ Click on tool buttons -----------------------------

            if (line[0].startsWith("rec"))
                editor.toolButtonClicked("rectangle");

            else if (line[0].startsWith("cir"))
                editor.toolButtonClicked("circle");

            else if (line[0].startsWith("tri"))
                editor.toolButtonClicked("triangle");

            else if (line[0].startsWith("sel"))
                editor.toolButtonClicked("selection");

            // $ Mouse actions -----------------------------

            else if (line[0].startsWith("cli"))
                editor.mousePressed(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("drag"))
                editor.mouseMoved(Integer.parseInt(line[1]), Integer.parseInt(line[2]));

            else if (line[0].startsWith("dro"))
                editor.mouseReleased(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
            
            //$ Commands undo y redo ---------------------------
            
            else if (line[0].startsWith("undo"))
            	editor.undo();
            else if (line[0].startsWith("redo"))
            	editor.redo();

            // $ Other commands -----------------------------

            else if (line[0].startsWith("draw"))
                editor.dibujar();

            else
                System.out.println("Invalid command");

        } while (true);
    }

}
