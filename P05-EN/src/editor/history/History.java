package editor.history;

import java.util.Stack;

import editor.history.change.Change;

public class History {

	private final Stack<Change> undoHistory = new Stack<>();
	private final Stack<Change> redoHistory = new Stack<>();

	/**
	 * Adds a new change to the history.
	 * 
	 * @param change Change to add.
	 */
	public void add(Change change) {
		this.undoHistory.push(change);
		this.redoHistory.clear();
	}

	/**
	 * Undoes last performed change if any.
	 * 
	 * @return Boolean representing if any action was made.
	 */
	public boolean undo() {
		// Check a change exists
		if (this.undoHistory.size() == 0)
			return false;

		// Perform undo
		Change c = this.undoHistory.pop();
		c.undo();
		this.redoHistory.push(c);

		return true;
	}

	/**
	 * Redoes last performed undo if any.
	 * 
	 * @return Boolean representing if any action was made.
	 */
	public boolean redo() {
		// Check a change exists
		if (this.redoHistory.size() == 0)
			return false;

		// Perform redo
		Change c = this.redoHistory.pop();
		c.redo();
		this.undoHistory.push(c);

		return true;
	}

}
