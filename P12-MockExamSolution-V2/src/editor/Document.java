package editor;

import java.util.regex.Pattern;

public class Document {
	private StringBuilder text = new StringBuilder();
	
	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}
	
	public void insert(String word) {
		text.append(word);
	}

	public void removeLastWord() {
		int indexOfLastWord = getText().toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			setText(new StringBuilder(""));
		else
			getText().setLength(indexOfLastWord + 1);
	}

	public void replace(String source, String destination) {
		String newText = getText().toString().replaceAll(Pattern.quote(source), destination);
		setText(new StringBuilder(newText));
	}
}
