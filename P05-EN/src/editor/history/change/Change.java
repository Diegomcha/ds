package editor.history.change;

public interface Change {
	
	/**
	 * Undoes the change.
	 */
	void undo();
	
	/**
	 * Redoes the change.
	 */
	void redo();

}
