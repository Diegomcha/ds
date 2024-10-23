package editor.core;

import java.util.Stack;

public class ChangesRecord {

    public void addChange(Change change) {
        undos.push(change);
        redos.clear();
    }

    public void undo() {
        if (undos.isEmpty()) {
            System.out.println("Info: it is not possible to do undo");
            return;
        }
        Change change = undos.pop();
        change.undo();
        redos.push(change);
    }

    public void redo() {
        if (redos.isEmpty()) {
            System.out.println("Info: it is not possible to do redo");
            return;
        }
        Change change = redos.pop();
        change.redo();
        undos.push(change);
    }

    private Stack<Change> undos = new Stack<>();
    private Stack<Change> redos = new Stack<>();
}
